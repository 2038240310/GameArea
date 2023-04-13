package com.ga.mapper;

import java.util.List;
import com.ga.domain.LibUpdateApply;
import org.apache.ibatis.annotations.Mapper;

/**
 * 资料库操作申请单Mapper接口
 * 
 * @author wws
 * @date 2023-04-13
 */
@Mapper
public interface LibUpdateApplyMapper 
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
     * 删除资料库操作申请单
     * 
     * @param id 资料库操作申请单主键
     * @return 结果
     */
    public int deleteLibUpdateApplyById(Long id);

    /**
     * 批量删除资料库操作申请单
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteLibUpdateApplyByIds(Long[] ids);
}
