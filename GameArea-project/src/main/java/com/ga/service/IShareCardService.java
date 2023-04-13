package com.ga.service;

import java.util.List;
import com.ga.domain.ShareCard;

/**
 * 分享站帖子Service接口
 * 
 * @author wws
 * @date 2023-04-13
 */
public interface IShareCardService 
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
     * 批量删除分享站帖子
     * 
     * @param cardIds 需要删除的分享站帖子主键集合
     * @return 结果
     */
    public int deleteShareCardByCardIds(Long[] cardIds);

    /**
     * 删除分享站帖子信息
     * 
     * @param cardId 分享站帖子主键
     * @return 结果
     */
    public int deleteShareCardByCardId(Long cardId);
}
