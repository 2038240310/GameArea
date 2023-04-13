package com.ga.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 分享站帖子类型对象 share_card_type
 * 
 * @author wws
 */
@Data
public class ShareCardType
{
    private static final long serialVersionUID = 1L;

    /** pk */
    private Long typeId;

    /** 类型名称 */
    private String typeName;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /** 修改时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    /** 状态，0启用，1关闭 */
    private String status;

}
