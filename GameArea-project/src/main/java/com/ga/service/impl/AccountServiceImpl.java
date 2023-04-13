package com.ga.service.impl;

import com.ga.domain.AreaUser;
import com.ga.domain.msg.AjaxResult;
import com.ga.service.IAccountService;
import com.ga.service.IAreaUserService;
import com.ga.utils.CaptchaUtils;
import com.ga.utils.DateTimeUtils;
import com.ga.utils.JJWTUtils;
import com.ga.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAreaUserService areaUserService;

    @Override
    public Map login(AreaUser areaUser) {
        areaUser.setPassword(MD5Utils.getHash(areaUser.getPassword()));

        List<AreaUser> list = areaUserService.selectAreaUserList(areaUser);

        if (list.isEmpty()){
            // 账号或者密码错误
            return null;
        }else {
            // 账号密码正确，返回token和userId
            Map<String, String> map = new HashMap<>();
            AreaUser passUser = list.get(0);
            map.put("userId", String.valueOf(passUser.getId()));
            map.put("token", JJWTUtils.createJWT(String.valueOf(passUser.getId()), passUser.getUsername(), 86400L));
            return map;
        }
    }

    @Override
    public int register(AreaUser areaUser) {
        // 密码加密
        String password = MD5Utils.getHash(areaUser.getPassword());

        // 用户名查重
        areaUser.setPassword("");
        List resultList = areaUserService.selectAreaUserList(areaUser);

        if (resultList.isEmpty()) {
            areaUser.setPassword(password);
            areaUser.setUserPermissions(1L);
            areaUser.setCreateTime(DateTimeUtils.now());
            areaUser.setUpdateTime(areaUser.getCreateTime());
            if (areaUserService.insertAreaUser(areaUser) > 0) {
                return 1;
            }
        }else {
            return 0;
        }
        return -1;
    }
}
