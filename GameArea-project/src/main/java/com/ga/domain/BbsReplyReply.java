package com.ga.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 论坛帖子二级回复消息对象 bbs_reply_reply
 * 
 * @author wws
 * @date 2023-04-13
 */
@Data
public class BbsReplyReply
{
    private static final long serialVersionUID = 1L;

    /** pk */
    private Long rrId;

    /** 二级回复信息文本 */
    private String message;

    /** 从属帖子id */
    private String cardId;

    /** 上级回复贴id */
    private String replyId;

    /** 回复对象id */
    private String replyTo;

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
