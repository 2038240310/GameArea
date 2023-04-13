package com.ga.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 平台用户对象 area_user
 * 
 * @author wws
 */
@Data
public class AreaUser
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 用户名 */
    private String username;

    /** 密码 */
    private String password;

    /** 邮箱 */
    private String email;

    /** 手机号码 */
    private String phone;

    /** 用户权限 (0.游客 1.普通用户 97.模块管理员 98.平台管理员 99.king) */
    private Long userPermissions;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /** 修改时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    /** 状态 */
    private Long status;

    public AreaUser() {}

    public AreaUser(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
