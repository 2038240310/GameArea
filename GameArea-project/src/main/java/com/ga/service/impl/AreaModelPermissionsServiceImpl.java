package com.ga.service.impl;

import java.util.List;

import com.ga.utils.DateTimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ga.mapper.AreaModelPermissionsMapper;
import com.ga.domain.AreaModelPermissions;
import com.ga.service.IAreaModelPermissionsService;

/**
 * 平台模块权限分配Service业务层处理
 * 
 * @author wws
 * @date 2023-04-13
 */
@Service
public class AreaModelPermissionsServiceImpl implements IAreaModelPermissionsService 
{
    @Autowired
    private AreaModelPermissionsMapper areaModelPermissionsMapper;

    /**
     * 查询平台模块权限分配
     * 
     * @param id 平台模块权限分配主键
     * @return 平台模块权限分配
     */
    @Override
    public AreaModelPermissions selectAreaModelPermissionsById(Long id)
    {
        return areaModelPermissionsMapper.selectAreaModelPermissionsById(id);
    }

    /**
     * 查询平台模块权限分配列表
     * 
     * @param areaModelPermissions 平台模块权限分配
     * @return 平台模块权限分配
     */
    @Override
    public List<AreaModelPermissions> selectAreaModelPermissionsList(AreaModelPermissions areaModelPermissions)
    {
        return areaModelPermissionsMapper.selectAreaModelPermissionsList(areaModelPermissions);
    }

    /**
     * 新增平台模块权限分配
     * 
     * @param areaModelPermissions 平台模块权限分配
     * @return 结果
     */
    @Override
    public int insertAreaModelPermissions(AreaModelPermissions areaModelPermissions)
    {
        areaModelPermissions.setCreateTime(DateTimeUtils.now());
        return areaModelPermissionsMapper.insertAreaModelPermissions(areaModelPermissions);
    }

    /**
     * 修改平台模块权限分配
     * 
     * @param areaModelPermissions 平台模块权限分配
     * @return 结果
     */
    @Override
    public int updateAreaModelPermissions(AreaModelPermissions areaModelPermissions)
    {
        areaModelPermissions.setUpdateTime(DateTimeUtils.now());
        return areaModelPermissionsMapper.updateAreaModelPermissions(areaModelPermissions);
    }

    /**
     * 批量删除平台模块权限分配
     * 
     * @param ids 需要删除的平台模块权限分配主键
     * @return 结果
     */
    @Override
    public int deleteAreaModelPermissionsByIds(Long[] ids)
    {
        return areaModelPermissionsMapper.deleteAreaModelPermissionsByIds(ids);
    }

    /**
     * 删除平台模块权限分配信息
     * 
     * @param id 平台模块权限分配主键
     * @return 结果
     */
    @Override
    public int deleteAreaModelPermissionsById(Long id)
    {
        return areaModelPermissionsMapper.deleteAreaModelPermissionsById(id);
    }
}
