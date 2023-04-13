package com.ga.mapper;

import java.util.List;
import com.ga.domain.ShareCardTag;
import org.apache.ibatis.annotations.Mapper;

/**
 * 资源站帖子-标签关联Mapper接口
 * 
 * @author wws
 * @date 2023-04-13
 */
@Mapper
public interface ShareCardTagMapper 
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
     * 删除资源站帖子-标签关联
     * 
     * @param relId 资源站帖子-标签关联主键
     * @return 结果
     */
    public int deleteShareCardTagByRelId(Long relId);

    /**
     * 批量删除资源站帖子-标签关联
     * 
     * @param relIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteShareCardTagByRelIds(Long[] relIds);
}
