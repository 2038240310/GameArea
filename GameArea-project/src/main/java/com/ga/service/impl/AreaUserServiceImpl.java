package com.ga.service.impl;

import java.util.List;

import com.ga.utils.DateTimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ga.mapper.AreaUserMapper;
import com.ga.domain.AreaUser;
import com.ga.service.IAreaUserService;

/**
 * 平台用户Service业务层处理
 * 
 * @author wws
 * @date 2023-04-13
 */
@Service
public class AreaUserServiceImpl implements IAreaUserService 
{
    @Autowired
    private AreaUserMapper areaUserMapper;

    /**
     * 查询平台用户
     * 
     * @param id 平台用户主键
     * @return 平台用户
     */
    @Override
    public AreaUser selectAreaUserById(Long id)
    {
        return areaUserMapper.selectAreaUserById(id);
    }

    /**
     * 查询平台用户列表
     * 
     * @param areaUser 平台用户
     * @return 平台用户
     */
    @Override
    public List<AreaUser> selectAreaUserList(AreaUser areaUser)
    {
        return areaUserMapper.selectAreaUserList(areaUser);
    }

    /**
     * 新增平台用户
     * 
     * @param areaUser 平台用户
     * @return 结果
     */
    @Override
    public int insertAreaUser(AreaUser areaUser)
    {
        areaUser.setCreateTime(DateTimeUtils.now());
        return areaUserMapper.insertAreaUser(areaUser);
    }

    /**
     * 修改平台用户
     * 
     * @param areaUser 平台用户
     * @return 结果
     */
    @Override
    public int updateAreaUser(AreaUser areaUser)
    {
        areaUser.setUpdateTime(DateTimeUtils.now());
        return areaUserMapper.updateAreaUser(areaUser);
    }

    /**
     * 批量删除平台用户
     * 
     * @param ids 需要删除的平台用户主键
     * @return 结果
     */
    @Override
    public int deleteAreaUserByIds(Long[] ids)
    {
        return areaUserMapper.deleteAreaUserByIds(ids);
    }

    /**
     * 删除平台用户信息
     * 
     * @param id 平台用户主键
     * @return 结果
     */
    @Override
    public int deleteAreaUserById(Long id)
    {
        return areaUserMapper.deleteAreaUserById(id);
    }
}
