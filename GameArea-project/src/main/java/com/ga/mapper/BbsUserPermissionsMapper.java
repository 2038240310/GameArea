package com.ga.mapper;

import java.util.List;
import com.ga.domain.BbsUserPermissions;
import org.apache.ibatis.annotations.Mapper;

/**
 * 帖子用户权限配置Mapper接口
 * 
 * @author wws
 * @date 2023-04-13
 */
@Mapper
public interface BbsUserPermissionsMapper 
{
    /**
     * 查询帖子用户权限配置
     * 
     * @param id 帖子用户权限配置主键
     * @return 帖子用户权限配置
     */
    public BbsUserPermissions selectBbsUserPermissionsById(Long id);

    /**
     * 查询帖子用户权限配置列表
     * 
     * @param bbsUserPermissions 帖子用户权限配置
     * @return 帖子用户权限配置集合
     */
    public List<BbsUserPermissions> selectBbsUserPermissionsList(BbsUserPermissions bbsUserPermissions);

    /**
     * 新增帖子用户权限配置
     * 
     * @param bbsUserPermissions 帖子用户权限配置
     * @return 结果
     */
    public int insertBbsUserPermissions(BbsUserPermissions bbsUserPermissions);

    /**
     * 修改帖子用户权限配置
     * 
     * @param bbsUserPermissions 帖子用户权限配置
     * @return 结果
     */
    public int updateBbsUserPermissions(BbsUserPermissions bbsUserPermissions);

    /**
     * 删除帖子用户权限配置
     * 
     * @param id 帖子用户权限配置主键
     * @return 结果
     */
    public int deleteBbsUserPermissionsById(Long id);

    /**
     * 批量删除帖子用户权限配置
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBbsUserPermissionsByIds(Long[] ids);
}
