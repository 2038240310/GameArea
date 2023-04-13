package com.ga.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 分享站标签管理对象 share_tag
 * 
 * @author wws
 */
@Data
public class ShareTag
{
    private static final long serialVersionUID = 1L;

    /** pk */
    private Long tagId;

    /** 标签名 */
    private String tagName;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /** 修改时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    /** 状态，0启用，1关闭 */
    private String status;

}
