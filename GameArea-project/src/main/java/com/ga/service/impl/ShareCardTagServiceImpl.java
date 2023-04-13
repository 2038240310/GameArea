package com.ga.service.impl;

import java.util.List;

import com.ga.utils.DateTimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ga.mapper.ShareCardTagMapper;
import com.ga.domain.ShareCardTag;
import com.ga.service.IShareCardTagService;

/**
 * 资源站帖子-标签关联Service业务层处理
 * 
 * @author wws
 * @date 2023-04-13
 */
@Service
public class ShareCardTagServiceImpl implements IShareCardTagService 
{
    @Autowired
    private ShareCardTagMapper shareCardTagMapper;

    /**
     * 查询资源站帖子-标签关联
     * 
     * @param relId 资源站帖子-标签关联主键
     * @return 资源站帖子-标签关联
     */
    @Override
    public ShareCardTag selectShareCardTagByRelId(Long relId)
    {
        return shareCardTagMapper.selectShareCardTagByRelId(relId);
    }

    /**
     * 查询资源站帖子-标签关联列表
     * 
     * @param shareCardTag 资源站帖子-标签关联
     * @return 资源站帖子-标签关联
     */
    @Override
    public List<ShareCardTag> selectShareCardTagList(ShareCardTag shareCardTag)
    {
        return shareCardTagMapper.selectShareCardTagList(shareCardTag);
    }

    /**
     * 新增资源站帖子-标签关联
     * 
     * @param shareCardTag 资源站帖子-标签关联
     * @return 结果
     */
    @Override
    public int insertShareCardTag(ShareCardTag shareCardTag)
    {
        shareCardTag.setCreateTime(DateTimeUtils.now());
        return shareCardTagMapper.insertShareCardTag(shareCardTag);
    }

    /**
     * 修改资源站帖子-标签关联
     * 
     * @param shareCardTag 资源站帖子-标签关联
     * @return 结果
     */
    @Override
    public int updateShareCardTag(ShareCardTag shareCardTag)
    {
        shareCardTag.setUpdateTime(DateTimeUtils.now());
        return shareCardTagMapper.updateShareCardTag(shareCardTag);
    }

    /**
     * 批量删除资源站帖子-标签关联
     * 
     * @param relIds 需要删除的资源站帖子-标签关联主键
     * @return 结果
     */
    @Override
    public int deleteShareCardTagByRelIds(Long[] relIds)
    {
        return shareCardTagMapper.deleteShareCardTagByRelIds(relIds);
    }

    /**
     * 删除资源站帖子-标签关联信息
     * 
     * @param relId 资源站帖子-标签关联主键
     * @return 结果
     */
    @Override
    public int deleteShareCardTagByRelId(Long relId)
    {
        return shareCardTagMapper.deleteShareCardTagByRelId(relId);
    }
}
