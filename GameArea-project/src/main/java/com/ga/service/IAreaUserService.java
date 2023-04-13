package com.ga.service;

import java.util.List;
import com.ga.domain.AreaUser;

/**
 * 平台用户Service接口
 * 
 * @author wws
 * @date 2023-04-13
 */
public interface IAreaUserService 
{
    /**
     * 查询平台用户
     * 
     * @param id 平台用户主键
     * @return 平台用户
     */
    public AreaUser selectAreaUserById(Long id);

    /**
     * 查询平台用户列表
     * 
     * @param areaUser 平台用户
     * @return 平台用户集合
     */
    public List<AreaUser> selectAreaUserList(AreaUser areaUser);

    /**
     * 新增平台用户
     * 
     * @param areaUser 平台用户
     * @return 结果
     */
    public int insertAreaUser(AreaUser areaUser);

    /**
     * 修改平台用户
     * 
     * @param areaUser 平台用户
     * @return 结果
     */
    public int updateAreaUser(AreaUser areaUser);

    /**
     * 批量删除平台用户
     * 
     * @param ids 需要删除的平台用户主键集合
     * @return 结果
     */
    public int deleteAreaUserByIds(Long[] ids);

    /**
     * 删除平台用户信息
     * 
     * @param id 平台用户主键
     * @return 结果
     */
    public int deleteAreaUserById(Long id);
}
