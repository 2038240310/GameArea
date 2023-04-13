package com.ga.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 分享站帖子对象 share_card
 * 
 * @author wws
 */
@Data
public class ShareCard
{
    private static final long serialVersionUID = 1L;

    /** pk */
    private Long cardId;

    /** 分享贴标题 */
    private String title;

    /** 分享贴类型id */
    private String typeId;

    /** 创建者id */
    private String createBy;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /** 修改人id */
    private String updateBy;

    /** 修改时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    /** 状态，0启用，1关闭 */
    private String status;

}
