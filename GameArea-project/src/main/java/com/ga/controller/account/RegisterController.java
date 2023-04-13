package com.ga.controller.account;

import com.ga.domain.AreaUser;
import com.ga.domain.msg.AjaxResult;
import com.ga.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ga/account/register")
public class RegisterController {

    @Autowired
    private IAccountService accountService;

    @PostMapping("/add")
    public AjaxResult register(@RequestBody AreaUser user) {
        switch (accountService.register(user)) {
            case 1: {
                return AjaxResult.success("注册成功");
            }
            case 0: {
                return AjaxResult.error("用户名重复");
            }
            default: {
                return AjaxResult.error("注册失败，未知原因");
            }
        }
    }

}
