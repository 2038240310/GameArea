package com.ga.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 论坛帖子对象 bbs_card
 * 
 * @author wws
 */
@Data
public class BbsCard
{
    private static final long serialVersionUID = 1L;

    /** pk */
    private Long cardId;

    /** 帖子标题 */
    private String title;

    /** 发帖简述 */
    private String message;

    /** 创建者id */
    private String createBy;

    /** 所属板块分类id */
    private String blockId;

    /** 所属区块分类id */
    private String areaId;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /** 修改时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    /** 状态，0启用，1封贴，2关闭 */
    private String status;

}
