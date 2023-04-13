package com.ga.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 公告版信息对象 sign_board
 * 
 * @author wws
 */
@Data
public class SignBoard
{
    private static final long serialVersionUID = 1L;

    /** pk */
    private Long boardId;

    /** 公告信息 */
    private String message;

    /** 公告分类id */
    private String boardType;

    /** 所属区块id */
    private String areaId;

    /** 导航地址 */
    private String linkPath;

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
