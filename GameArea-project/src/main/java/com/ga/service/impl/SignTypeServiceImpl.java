package com.ga.service.impl;

import java.util.List;

import com.ga.utils.DateTimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ga.mapper.SignTypeMapper;
import com.ga.domain.SignType;
import com.ga.service.ISignTypeService;

/**
 * 公告版类型管理Service业务层处理
 * 
 * @author wws
 * @date 2023-04-13
 */
@Service
public class SignTypeServiceImpl implements ISignTypeService 
{
    @Autowired
    private SignTypeMapper signTypeMapper;

    /**
     * 查询公告版类型管理
     * 
     * @param typeId 公告版类型管理主键
     * @return 公告版类型管理
     */
    @Override
    public SignType selectSignTypeByTypeId(Long typeId)
    {
        return signTypeMapper.selectSignTypeByTypeId(typeId);
    }

    /**
     * 查询公告版类型管理列表
     * 
     * @param signType 公告版类型管理
     * @return 公告版类型管理
     */
    @Override
    public List<SignType> selectSignTypeList(SignType signType)
    {
        return signTypeMapper.selectSignTypeList(signType);
    }

    /**
     * 新增公告版类型管理
     * 
     * @param signType 公告版类型管理
     * @return 结果
     */
    @Override
    public int insertSignType(SignType signType)
    {
        signType.setCreateTime(DateTimeUtils.now());
        return signTypeMapper.insertSignType(signType);
    }

    /**
     * 修改公告版类型管理
     * 
     * @param signType 公告版类型管理
     * @return 结果
     */
    @Override
    public int updateSignType(SignType signType)
    {
        signType.setUpdateTime(DateTimeUtils.now());
        return signTypeMapper.updateSignType(signType);
    }

    /**
     * 批量删除公告版类型管理
     * 
     * @param typeIds 需要删除的公告版类型管理主键
     * @return 结果
     */
    @Override
    public int deleteSignTypeByTypeIds(Long[] typeIds)
    {
        return signTypeMapper.deleteSignTypeByTypeIds(typeIds);
    }

    /**
     * 删除公告版类型管理信息
     * 
     * @param typeId 公告版类型管理主键
     * @return 结果
     */
    @Override
    public int deleteSignTypeByTypeId(Long typeId)
    {
        return signTypeMapper.deleteSignTypeByTypeId(typeId);
    }
}
