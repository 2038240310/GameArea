package com.ga.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 公告版类型管理对象 sign_type
 * 
 * @author wws
 */
@Data
public class SignType
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
