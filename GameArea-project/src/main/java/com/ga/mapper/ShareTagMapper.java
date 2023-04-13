package com.ga.mapper;

import java.util.List;
import com.ga.domain.ShareTag;
import org.apache.ibatis.annotations.Mapper;

/**
 * 分享站标签管理Mapper接口
 * 
 * @author wws
 * @date 2023-04-13
 */
@Mapper
public interface ShareTagMapper 
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
     * 删除分享站标签管理
     * 
     * @param tagId 分享站标签管理主键
     * @return 结果
     */
    public int deleteShareTagByTagId(Long tagId);

    /**
     * 批量删除分享站标签管理
     * 
     * @param tagIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteShareTagByTagIds(Long[] tagIds);
}
