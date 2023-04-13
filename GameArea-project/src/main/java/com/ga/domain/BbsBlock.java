package com.ga.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 论坛板块对象 bbs_block
 * 
 * @author wws
 * @date 2023-04-13
 */
@Data
public class BbsBlock
{
    private static final long serialVersionUID = 1L;

    /** pk */
    private Long blockId;

    /** 板块名称 */
    private String blockName;

    /** 图标路径 */
    private String picPath;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /** 修改时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    /** 状态，0启用，1关闭 */
    private String status;

}
