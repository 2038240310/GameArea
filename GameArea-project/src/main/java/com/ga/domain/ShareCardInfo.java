package com.ga.domain;

import lombok.Data;

/**
 * 资源站帖子信息对象 share_card_info
 * 
 * @author wws
 * @date 2023-04-13
 */
@Data
public class ShareCardInfo
{
    private static final long serialVersionUID = 1L;

    /** pk */
    private Long infoId;

    /** 关联资源帖子id */
    private String cardId;

    /** 帖子页面内容 */
    private String message;

    /** 资源信息 */
    private String sourceInfo;

    /** 资源相关地址 */
    private String sourceLink;

}
