package com.ga.service;

import java.util.List;
import com.ga.domain.LibUpdateApply;

/**
 * 资料库操作申请单Service接口
 * 
 * @author wws
 * @date 2023-04-13
 */
public interface ILibUpdateApplyService 
{
    /**
     * 查询资料库操作申请单
     * 
     * @param id 资料库操作申请单主键
     * @return 资料库操作申请单
     */
    public LibUpdateApply selectLibUpdateApplyById(Long id);

    /**
     * 查询资料库操作申请单列表
     * 
     * @param libUpdateApply 资料库操作申请单
     * @return 资料库操作申请单集合
     */
    public List<LibUpdateApply> selectLibUpdateApplyList(LibUpdateApply libUpdateApply);

    /**
     * 新增资料库操作申请单
     * 
     * @param libUpdateApply 资料库操作申请单
     * @return 结果
     */
    public int insertLibUpdateApply(LibUpdateApply libUpdateApply);

    /**
     * 修改资料库操作申请单
     * 
     * @param libUpdateApply 资料库操作申请单
     * @return 结果
     */
    public int updateLibUpdateApply(LibUpdateApply libUpdateApply);

    /**
     * 批量删除资料库操作申请单
     * 
     * @param ids 需要删除的资料库操作申请单主键集合
     * @return 结果
     */
    public int deleteLibUpdateApplyByIds(Long[] ids);

    /**
     * 删除资料库操作申请单信息
     * 
     * @param id 资料库操作申请单主键
     * @return 结果
     */
    public int deleteLibUpdateApplyById(Long id);
}
