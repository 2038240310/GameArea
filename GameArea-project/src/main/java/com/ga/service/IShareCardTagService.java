package com.ga.service;

import java.util.List;
import com.ga.domain.ShareCardTag;

/**
 * 资源站帖子-标签关联Service接口
 * 
 * @author wws
 * @date 2023-04-13
 */
public interface IShareCardTagService 
{
    /**
     * 查询资源站帖子-标签关联
     * 
     * @param relId 资源站帖子-标签关联主键
     * @return 资源站帖子-标签关联
     */
    public ShareCardTag selectShareCardTagByRelId(Long relId);

    /**
     * 查询资源站帖子-标签关联列表
     * 
     * @param shareCardTag 资源站帖子-标签关联
     * @return 资源站帖子-标签关联集合
     */
    public List<ShareCardTag> selectShareCardTagList(ShareCardTag shareCardTag);

    /**
     * 新增资源站帖子-标签关联
     * 
     * @param shareCardTag 资源站帖子-标签关联
     * @return 结果
     */
    public int insertShareCardTag(ShareCardTag shareCardTag);

    /**
     * 修改资源站帖子-标签关联
     * 
     * @param shareCardTag 资源站帖子-标签关联
     * @return 结果
     */
    public int updateShareCardTag(ShareCardTag shareCardTag);

    /**
     * 批量删除资源站帖子-标签关联
     * 
     * @param relIds 需要删除的资源站帖子-标签关联主键集合
     * @return 结果
     */
    public int deleteShareCardTagByRelIds(Long[] relIds);

    /**
     * 删除资源站帖子-标签关联信息
     * 
     * @param relId 资源站帖子-标签关联主键
     * @return 结果
     */
    public int deleteShareCardTagByRelId(Long relId);
}
