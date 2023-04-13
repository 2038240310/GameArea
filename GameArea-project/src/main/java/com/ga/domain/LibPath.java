package com.ga.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 资料库资源路径对象 lib_path
 * 
 * @author wws
 * @date 2023-04-13
 */
@Data
public class LibPath
{
    private static final long serialVersionUID = 1L;

    /** pk */
    private Long pathId;

    /** 资源路径 */
    private String dataPath;

    /** 增加时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createTime;

    /** 修改时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    /** 状态，0可用，1维护，2关闭 */
    private String status;

    /** 资源名称 */
    private String dataName;

}
