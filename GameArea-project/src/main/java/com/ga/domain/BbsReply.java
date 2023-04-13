package com.ga.domain;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 论坛帖子回复信息对象 bbs_reply
 * 
 * @author wws
 */
@Data
public class BbsReply
{
    private static final long serialVersionUID = 1L;

    /** pk */
    private Long replyId;

    /** 回复消息 */
    private String message;

    /** 所属帖子id */
    private String cardId;

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
