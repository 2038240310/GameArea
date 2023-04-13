package com.ga.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 资料库操作申请单对象 lib_update_apply
 * 
 * @author wws
 * @date 2023-04-13
 */
@Data
public class LibUpdateApply
{
    private static final long serialVersionUID = 1L;

    /** pk */
    private Long id;

    /** 操作类型 （0.修改 1.新增 2.标记错误） */
    private Long applyType;

    /** 申请人id（user_id） */
    private String applicantId;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /** 状态 (0.未处理 1.已处理 2.不通过) */
    private String status;

    /** 操作对象 */
    private String applyToId;

}
