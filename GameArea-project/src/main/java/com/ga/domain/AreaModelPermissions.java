package com.ga.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 平台模块权限分配对象 area_model_permissions
 * 
 * @author wws
 */
@Data
public class AreaModelPermissions
{
    private static final long serialVersionUID = 1L;

    /** pk */
    private Long id;

    /** 关联人id */
    private String userId;

    /** 管理模块 （1.论坛(bbs) 2.分享站(share) 3.资料站(lib) 4.公告资讯站(sign) ） */
    private String model;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /** 修改时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    /** 状态( 0.生效 1.撤销 2.待观察 ) */
    private String status;

}
