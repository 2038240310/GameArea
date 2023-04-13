package com.ga.domain;

import lombok.Data;

/**
 * 平台用户信息对象 area_user_info
 * 
 * @author wws
 */
@Data
public class AreaUserInfo
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 关联用户id */
    private String userId;

    /** 用户等级 */
    private Long level;

    /** 用户简讯 */
    private String message;

    /** 用户头像资源路径 */
    private String avatarPath;

    /** 昵称 (初始化为用户账号) */
    private String nickname;

}
