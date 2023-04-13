package com.ga.service.impl;

import java.util.List;

import com.ga.utils.DateTimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ga.mapper.ShareCardTypeMapper;
import com.ga.domain.ShareCardType;
import com.ga.service.IShareCardTypeService;

/**
 * 分享站帖子类型Service业务层处理
 * 
 * @author wws
 * @date 2023-04-13
 */
@Service
public class ShareCardTypeServiceImpl implements IShareCardTypeService 
{
    @Autowired
    private ShareCardTypeMapper shareCardTypeMapper;

    /**
     * 查询分享站帖子类型
     * 
     * @param typeId 分享站帖子类型主键
     * @return 分享站帖子类型
     */
    @Override
    public ShareCardType selectShareCardTypeByTypeId(Long typeId)
    {
        return shareCardTypeMapper.selectShareCardTypeByTypeId(typeId);
    }

    /**
     * 查询分享站帖子类型列表
     * 
     * @param shareCardType 分享站帖子类型
     * @return 分享站帖子类型
     */
    @Override
    public List<ShareCardType> selectShareCardTypeList(ShareCardType shareCardType)
    {
        return shareCardTypeMapper.selectShareCardTypeList(shareCardType);
    }

    /**
     * 新增分享站帖子类型
     * 
     * @param shareCardType 分享站帖子类型
     * @return 结果
     */
    @Override
    public int insertShareCardType(ShareCardType shareCardType)
    {
        shareCardType.setCreateTime(DateTimeUtils.now());
        return shareCardTypeMapper.insertShareCardType(shareCardType);
    }

    /**
     * 修改分享站帖子类型
     * 
     * @param shareCardType 分享站帖子类型
     * @return 结果
     */
    @Override
    public int updateShareCardType(ShareCardType shareCardType)
    {
        shareCardType.setUpdateTime(DateTimeUtils.now());
        return shareCardTypeMapper.updateShareCardType(shareCardType);
    }

    /**
     * 批量删除分享站帖子类型
     * 
     * @param typeIds 需要删除的分享站帖子类型主键
     * @return 结果
     */
    @Override
    public int deleteShareCardTypeByTypeIds(Long[] typeIds)
    {
        return shareCardTypeMapper.deleteShareCardTypeByTypeIds(typeIds);
    }

    /**
     * 删除分享站帖子类型信息
     * 
     * @param typeId 分享站帖子类型主键
     * @return 结果
     */
    @Override
    public int deleteShareCardTypeByTypeId(Long typeId)
    {
        return shareCardTypeMapper.deleteShareCardTypeByTypeId(typeId);
    }
}
