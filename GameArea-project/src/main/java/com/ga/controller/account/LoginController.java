package com.ga.controller.account;

import com.ga.domain.AreaUser;
import com.ga.domain.msg.AjaxResult;
import com.ga.domain.req.LoginReq;
import com.ga.service.IAccountService;
import com.ga.utils.CaptchaUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 登录验证
 */

@RestController
@RequestMapping("/ga/account/login")
@CrossOrigin
public class LoginController {

    @Autowired
    private IAccountService accountService;

    /**
     * 验证码、账号、密码校验登录
     * @param loginReq
     * @return
     */
    @PostMapping("/check")
    public AjaxResult login(@RequestBody LoginReq loginReq) {
        if (CaptchaUtils.verify(loginReq.getUuid(), loginReq.getCode())) {
            Map result = accountService.login(new AreaUser(loginReq.getUsername(), loginReq.getPassword()));
            if (result == null || result.isEmpty()){
                return AjaxResult.error("账号或者密码错误");
            }else {
                return AjaxResult.success(result);
            }
        }else {
            return AjaxResult.error("验证码错误或者已过期");
        }

    }

    /**
     * 获取验证码
     * @param
     * @return
     */
    @GetMapping(path = "/kaptcha/get")
    public AjaxResult getKaptcha() {
        Map data= CaptchaUtils.createCaptchaAndUuid();
        return data.isEmpty() ? AjaxResult.error("验证码获取错误") : AjaxResult.success().put("data", data);
    }

}
