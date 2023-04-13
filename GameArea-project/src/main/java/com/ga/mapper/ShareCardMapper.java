package com.ga.mapper;

import java.util.List;
import com.ga.domain.ShareCard;
import org.apache.ibatis.annotations.Mapper;

/**
 * 分享站帖子Mapper接口
 * 
 * @author wws
 * @date 2023-04-13
 */
@Mapper
public interface ShareCardMapper 
{
    /**
     * 查询分享站帖子
     * 
     * @param cardId 分享站帖子主键
     * @return 分享站帖子
     */
    public ShareCard selectShareCardByCardId(Long cardId);

    /**
     * 查询分享站帖子列表
     * 
     * @param shareCard 分享站帖子
     * @return 分享站帖子集合
     */
    public List<ShareCard> selectShareCardList(ShareCard shareCard);

    /**
     * 新增分享站帖子
     * 
     * @param shareCard 分享站帖子
     * @return 结果
     */
    public int insertShareCard(ShareCard shareCard);

    /**
     * 修改分享站帖子
     * 
     * @param shareCard 分享站帖子
     * @return 结果
     */
    public int updateShareCard(ShareCard shareCard);

    /**
     * 删除分享站帖子
     * 
     * @param cardId 分享站帖子主键
     * @return 结果
     */
    public int deleteShareCardByCardId(Long cardId);

    /**
     * 批量删除分享站帖子
     * 
     * @param cardIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteShareCardByCardIds(Long[] cardIds);
}
