package com.ga.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 分享站帖子回复对象 share_card_reply
 * 
 * @author wws
 * @date 2023-04-13
 */
@Data
public class ShareCardReply
{
    private static final long serialVersionUID = 1L;

    /** pk */
    private Long replyId;

    /** 关联资源帖id */
    private String cardId;

    /** 回复信息文本 */
    private String message;

    /** 创建人名称 */
    private String createName;

    /** 创建者id */
    private String createBy;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /** 修改时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    /** 状态，0启用，1关闭 */
    private String status;

}
