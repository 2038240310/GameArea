package com.ga.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 平台最高级分区对象 area_area
 * 
 * @author wws
 * @date 2023-04-13
 */
@Data
public class AreaArea
{
    private static final long serialVersionUID = 1L;

    /** pk */
    private Long id;

    /** 分区域名 */
    private String areaName;

    /** 分区显示图表 */
    private String areaPicSource;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /** 状态 (0.启用 1.关闭 2.弃用) */
    private String status;

}
