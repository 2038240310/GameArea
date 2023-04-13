package com.ga.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 帖子用户权限配置对象 bbs_user_permissions
 * 
 * @author wws
 */
@Data
public class BbsUserPermissions
{
    private static final long serialVersionUID = 1L;

    /** pk */
    private Long id;

    /** 关联帖子板块id */
    private String blockId;

    /** 关联用户id */
    private String userId;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /** 状态 （0.生效中 1.撤销 2.待审核） */
    private String status;

    /** 授权人id */
    private String permissionOfferPersonId;

    /** 审核人id */
    private String permissionPassPersonId;

}
