package com.ga.service;

import java.util.List;
import com.ga.domain.ShareTag;

/**
 * 分享站标签管理Service接口
 * 
 * @author wws
 * @date 2023-04-13
 */
public interface IShareTagService 
{
    /**
     * 查询分享站标签管理
     * 
     * @param tagId 分享站标签管理主键
     * @return 分享站标签管理
     */
    public ShareTag selectShareTagByTagId(Long tagId);

    /**
     * 查询分享站标签管理列表
     * 
     * @param shareTag 分享站标签管理
     * @return 分享站标签管理集合
     */
    public List<ShareTag> selectShareTagList(ShareTag shareTag);

    /**
     * 新增分享站标签管理
     * 
     * @param shareTag 分享站标签管理
     * @return 结果
     */
    public int insertShareTag(ShareTag shareTag);

    /**
     * 修改分享站标签管理
     * 
     * @param shareTag 分享站标签管理
     * @return 结果
     */
    public int updateShareTag(ShareTag shareTag);

    /**
     * 批量删除分享站标签管理
     * 
     * @param tagIds 需要删除的分享站标签管理主键集合
     * @return 结果
     */
    public int deleteShareTagByTagIds(Long[] tagIds);

    /**
     * 删除分享站标签管理信息
     * 
     * @param tagId 分享站标签管理主键
     * @return 结果
     */
    public int deleteShareTagByTagId(Long tagId);
}
