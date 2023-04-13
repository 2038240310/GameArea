package com.ga.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 资源站帖子-标签关联对象 share_card_tag
 * 
 * @author wws
 * @date 2023-04-13
 */
@Data
public class ShareCardTag
{
    private static final long serialVersionUID = 1L;

    /** pk */
    private Long relId;

    /** 关联资源帖子id */
    private String cardId;

    /** 关联标签id */
    private String tagId;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /** 修改时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    /** 状态，0启用，1关闭 */
    private String status;

}
