package com.ga.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ga.mapper.AreaUserInfoMapper;
import com.ga.domain.AreaUserInfo;
import com.ga.service.IAreaUserInfoService;

/**
 * 平台用户信息Service业务层处理
 * 
 * @author wws
 * @date 2023-04-13
 */
@Service
public class AreaUserInfoServiceImpl implements IAreaUserInfoService 
{
    @Autowired
    private AreaUserInfoMapper areaUserInfoMapper;

    /**
     * 查询平台用户信息
     * 
     * @param id 平台用户信息主键
     * @return 平台用户信息
     */
    @Override
    public AreaUserInfo selectAreaUserInfoById(Long id)
    {
        return areaUserInfoMapper.selectAreaUserInfoById(id);
    }

    /**
     * 查询平台用户信息列表
     * 
     * @param areaUserInfo 平台用户信息
     * @return 平台用户信息
     */
    @Override
    public List<AreaUserInfo> selectAreaUserInfoList(AreaUserInfo areaUserInfo)
    {
        return areaUserInfoMapper.selectAreaUserInfoList(areaUserInfo);
    }

    /**
     * 新增平台用户信息
     * 
     * @param areaUserInfo 平台用户信息
     * @return 结果
     */
    @Override
    public int insertAreaUserInfo(AreaUserInfo areaUserInfo)
    {
        return areaUserInfoMapper.insertAreaUserInfo(areaUserInfo);
    }

    /**
     * 修改平台用户信息
     * 
     * @param areaUserInfo 平台用户信息
     * @return 结果
     */
    @Override
    public int updateAreaUserInfo(AreaUserInfo areaUserInfo)
    {
        return areaUserInfoMapper.updateAreaUserInfo(areaUserInfo);
    }

    /**
     * 批量删除平台用户信息
     * 
     * @param ids 需要删除的平台用户信息主键
     * @return 结果
     */
    @Override
    public int deleteAreaUserInfoByIds(Long[] ids)
    {
        return areaUserInfoMapper.deleteAreaUserInfoByIds(ids);
    }

    /**
     * 删除平台用户信息信息
     * 
     * @param id 平台用户信息主键
     * @return 结果
     */
    @Override
    public int deleteAreaUserInfoById(Long id)
    {
        return areaUserInfoMapper.deleteAreaUserInfoById(id);
    }
}
