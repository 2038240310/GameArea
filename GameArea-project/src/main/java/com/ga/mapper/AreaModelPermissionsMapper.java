package com.ga.mapper;

import java.util.List;
import com.ga.domain.AreaModelPermissions;
import org.apache.ibatis.annotations.Mapper;

/**
 * 平台模块权限分配Mapper接口
 * 
 * @author wws
 * @date 2023-04-13
 */
@Mapper
public interface AreaModelPermissionsMapper 
{
    /**
     * 查询平台模块权限分配
     * 
     * @param id 平台模块权限分配主键
     * @return 平台模块权限分配
     */
    public AreaModelPermissions selectAreaModelPermissionsById(Long id);

    /**
     * 查询平台模块权限分配列表
     * 
     * @param areaModelPermissions 平台模块权限分配
     * @return 平台模块权限分配集合
     */
    public List<AreaModelPermissions> selectAreaModelPermissionsList(AreaModelPermissions areaModelPermissions);

    /**
     * 新增平台模块权限分配
     * 
     * @param areaModelPermissions 平台模块权限分配
     * @return 结果
     */
    public int insertAreaModelPermissions(AreaModelPermissions areaModelPermissions);

    /**
     * 修改平台模块权限分配
     * 
     * @param areaModelPermissions 平台模块权限分配
     * @return 结果
     */
    public int updateAreaModelPermissions(AreaModelPermissions areaModelPermissions);

    /**
     * 删除平台模块权限分配
     * 
     * @param id 平台模块权限分配主键
     * @return 结果
     */
    public int deleteAreaModelPermissionsById(Long id);

    /**
     * 批量删除平台模块权限分配
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAreaModelPermissionsByIds(Long[] ids);
}
