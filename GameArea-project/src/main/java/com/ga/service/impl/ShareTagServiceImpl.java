package com.ga.service.impl;

import java.util.List;

import com.ga.utils.DateTimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ga.mapper.ShareTagMapper;
import com.ga.domain.ShareTag;
import com.ga.service.IShareTagService;

/**
 * 分享站标签管理Service业务层处理
 * 
 * @author wws
 * @date 2023-04-13
 */
@Service
public class ShareTagServiceImpl implements IShareTagService 
{
    @Autowired
    private ShareTagMapper shareTagMapper;

    /**
     * 查询分享站标签管理
     * 
     * @param tagId 分享站标签管理主键
     * @return 分享站标签管理
     */
    @Override
    public ShareTag selectShareTagByTagId(Long tagId)
    {
        return shareTagMapper.selectShareTagByTagId(tagId);
    }

    /**
     * 查询分享站标签管理列表
     * 
     * @param shareTag 分享站标签管理
     * @return 分享站标签管理
     */
    @Override
    public List<ShareTag> selectShareTagList(ShareTag shareTag)
    {
        return shareTagMapper.selectShareTagList(shareTag);
    }

    /**
     * 新增分享站标签管理
     * 
     * @param shareTag 分享站标签管理
     * @return 结果
     */
    @Override
    public int insertShareTag(ShareTag shareTag)
    {
        shareTag.setCreateTime(DateTimeUtils.now());
        return shareTagMapper.insertShareTag(shareTag);
    }

    /**
     * 修改分享站标签管理
     * 
     * @param shareTag 分享站标签管理
     * @return 结果
     */
    @Override
    public int updateShareTag(ShareTag shareTag)
    {
        shareTag.setUpdateTime(DateTimeUtils.now());
        return shareTagMapper.updateShareTag(shareTag);
    }

    /**
     * 批量删除分享站标签管理
     * 
     * @param tagIds 需要删除的分享站标签管理主键
     * @return 结果
     */
    @Override
    public int deleteShareTagByTagIds(Long[] tagIds)
    {
        return shareTagMapper.deleteShareTagByTagIds(tagIds);
    }

    /**
     * 删除分享站标签管理信息
     * 
     * @param tagId 分享站标签管理主键
     * @return 结果
     */
    @Override
    public int deleteShareTagByTagId(Long tagId)
    {
        return shareTagMapper.deleteShareTagByTagId(tagId);
    }
}
