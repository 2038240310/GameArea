package com.ga.domain;

import lombok.Data;

/**
 * 论坛帖子信息对象 bbs_card_info
 * 
 * @author wws
 * @date 2023-04-13
 */
@Data
public class BbsCardInfo
{
    private static final long serialVersionUID = 1L;

    /** pk */
    private Long infoId;

    /** 相关帖子id */
    private String cardId;

    /** 喜欢数量 */
    private Long likeNum;

    /** 评论数量 */
    private Long commentNum;

    /** 富文本、图片路径 */
    private String sourcePath;

    /** 发帖信息内容 */
    private String message;

}
