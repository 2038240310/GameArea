package com.ga.service;

import com.ga.domain.AreaUser;

import java.util.Map;

/**
 * 账号相关操作业务
 */
public interface IAccountService {

    /**
     * 登录业务
     * @param areaUser
     * @return
     */
    public Map login(AreaUser areaUser);

    /**
     * 注册业务
     * @param areaUser
     * @return
     */
    public int register(AreaUser areaUser);

}
