package com.ga.service.impl;

import java.util.List;

import com.ga.utils.DateTimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ga.mapper.LibUpdateApplyMapper;
import com.ga.domain.LibUpdateApply;
import com.ga.service.ILibUpdateApplyService;

/**
 * 资料库操作申请单Service业务层处理
 * 
 * @author wws
 * @date 2023-04-13
 */
@Service
public class LibUpdateApplyServiceImpl implements ILibUpdateApplyService 
{
    @Autowired
    private LibUpdateApplyMapper libUpdateApplyMapper;

    /**
     * 查询资料库操作申请单
     * 
     * @param id 资料库操作申请单主键
     * @return 资料库操作申请单
     */
    @Override
    public LibUpdateApply selectLibUpdateApplyById(Long id)
    {
        return libUpdateApplyMapper.selectLibUpdateApplyById(id);
    }

    /**
     * 查询资料库操作申请单列表
     * 
     * @param libUpdateApply 资料库操作申请单
     * @return 资料库操作申请单
     */
    @Override
    public List<LibUpdateApply> selectLibUpdateApplyList(LibUpdateApply libUpdateApply)
    {
        return libUpdateApplyMapper.selectLibUpdateApplyList(libUpdateApply);
    }

    /**
     * 新增资料库操作申请单
     * 
     * @param libUpdateApply 资料库操作申请单
     * @return 结果
     */
    @Override
    public int insertLibUpdateApply(LibUpdateApply libUpdateApply)
    {
        libUpdateApply.setCreateTime(DateTimeUtils.now());
        return libUpdateApplyMapper.insertLibUpdateApply(libUpdateApply);
    }

    /**
     * 修改资料库操作申请单
     * 
     * @param libUpdateApply 资料库操作申请单
     * @return 结果
     */
    @Override
    public int updateLibUpdateApply(LibUpdateApply libUpdateApply)
    {
        return libUpdateApplyMapper.updateLibUpdateApply(libUpdateApply);
    }

    /**
     * 批量删除资料库操作申请单
     * 
     * @param ids 需要删除的资料库操作申请单主键
     * @return 结果
     */
    @Override
    public int deleteLibUpdateApplyByIds(Long[] ids)
    {
        return libUpdateApplyMapper.deleteLibUpdateApplyByIds(ids);
    }

    /**
     * 删除资料库操作申请单信息
     * 
     * @param id 资料库操作申请单主键
     * @return 结果
     */
    @Override
    public int deleteLibUpdateApplyById(Long id)
    {
        return libUpdateApplyMapper.deleteLibUpdateApplyById(id);
    }
}
