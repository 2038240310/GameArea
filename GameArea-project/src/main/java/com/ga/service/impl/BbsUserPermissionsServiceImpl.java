package com.ga.service.impl;

import java.util.List;

import com.ga.utils.DateTimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ga.mapper.BbsUserPermissionsMapper;
import com.ga.domain.BbsUserPermissions;
import com.ga.service.IBbsUserPermissionsService;

/**
 * 帖子用户权限配置Service业务层处理
 * 
 * @author wws
 * @date 2023-04-13
 */
@Service
public class BbsUserPermissionsServiceImpl implements IBbsUserPermissionsService 
{
    @Autowired
    private BbsUserPermissionsMapper bbsUserPermissionsMapper;

    /**
     * 查询帖子用户权限配置
     * 
     * @param id 帖子用户权限配置主键
     * @return 帖子用户权限配置
     */
    @Override
    public BbsUserPermissions selectBbsUserPermissionsById(Long id)
    {
        return bbsUserPermissionsMapper.selectBbsUserPermissionsById(id);
    }

    /**
     * 查询帖子用户权限配置列表
     * 
     * @param bbsUserPermissions 帖子用户权限配置
     * @return 帖子用户权限配置
     */
    @Override
    public List<BbsUserPermissions> selectBbsUserPermissionsList(BbsUserPermissions bbsUserPermissions)
    {
        return bbsUserPermissionsMapper.selectBbsUserPermissionsList(bbsUserPermissions);
    }

    /**
     * 新增帖子用户权限配置
     * 
     * @param bbsUserPermissions 帖子用户权限配置
     * @return 结果
     */
    @Override
    public int insertBbsUserPermissions(BbsUserPermissions bbsUserPermissions)
    {
        bbsUserPermissions.setCreateTime(DateTimeUtils.now());
        return bbsUserPermissionsMapper.insertBbsUserPermissions(bbsUserPermissions);
    }

    /**
     * 修改帖子用户权限配置
     * 
     * @param bbsUserPermissions 帖子用户权限配置
     * @return 结果
     */
    @Override
    public int updateBbsUserPermissions(BbsUserPermissions bbsUserPermissions)
    {
        return bbsUserPermissionsMapper.updateBbsUserPermissions(bbsUserPermissions);
    }

    /**
     * 批量删除帖子用户权限配置
     * 
     * @param ids 需要删除的帖子用户权限配置主键
     * @return 结果
     */
    @Override
    public int deleteBbsUserPermissionsByIds(Long[] ids)
    {
        return bbsUserPermissionsMapper.deleteBbsUserPermissionsByIds(ids);
    }

    /**
     * 删除帖子用户权限配置信息
     * 
     * @param id 帖子用户权限配置主键
     * @return 结果
     */
    @Override
    public int deleteBbsUserPermissionsById(Long id)
    {
        return bbsUserPermissionsMapper.deleteBbsUserPermissionsById(id);
    }
}
