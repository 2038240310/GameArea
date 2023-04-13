package com.ga.mapper;

import java.util.List;
import com.ga.domain.AreaUserInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * 平台用户信息Mapper接口
 * 
 * @author wws
 * @date 2023-04-13
 */
@Mapper
public interface AreaUserInfoMapper 
{
    /**
     * 查询平台用户信息
     * 
     * @param id 平台用户信息主键
     * @return 平台用户信息
     */
    public AreaUserInfo selectAreaUserInfoById(Long id);

    /**
     * 查询平台用户信息列表
     * 
     * @param areaUserInfo 平台用户信息
     * @return 平台用户信息集合
     */
    public List<AreaUserInfo> selectAreaUserInfoList(AreaUserInfo areaUserInfo);

    /**
     * 新增平台用户信息
     * 
     * @param areaUserInfo 平台用户信息
     * @return 结果
     */
    public int insertAreaUserInfo(AreaUserInfo areaUserInfo);

    /**
     * 修改平台用户信息
     * 
     * @param areaUserInfo 平台用户信息
     * @return 结果
     */
    public int updateAreaUserInfo(AreaUserInfo areaUserInfo);

    /**
     * 删除平台用户信息
     * 
     * @param id 平台用户信息主键
     * @return 结果
     */
    public int deleteAreaUserInfoById(Long id);

    /**
     * 批量删除平台用户信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAreaUserInfoByIds(Long[] ids);
}
