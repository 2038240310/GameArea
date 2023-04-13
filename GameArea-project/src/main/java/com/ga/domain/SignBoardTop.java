package com.ga.domain;

import lombok.Data;

/**
 * 头条公告信息（主页告示牌图片展示）对象 sign_board_top
 * 
 * @author wws
 */
@Data
public class SignBoardTop
{
    private static final long serialVersionUID = 1L;

    /** pk */
    private Long topIp;

    /** 相关联公告id */
    private String boardId;

    /** 标题 */
    private String title;

    /** 图片资源路径 */
    private String picPath;

    /** 导航路径 */
    private String linkPath;

}
