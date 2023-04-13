package com.ga.service.impl;

import java.util.List;

import com.ga.utils.DateTimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ga.mapper.ShareCardMapper;
import com.ga.domain.ShareCard;
import com.ga.service.IShareCardService;

/**
 * 分享站帖子Service业务层处理
 * 
 * @author wws
 * @date 2023-04-13
 */
@Service
public class ShareCardServiceImpl implements IShareCardService 
{
    @Autowired
    private ShareCardMapper shareCardMapper;

    /**
     * 查询分享站帖子
     * 
     * @param cardId 分享站帖子主键
     * @return 分享站帖子
     */
    @Override
    public ShareCard selectShareCardByCardId(Long cardId)
    {
        return shareCardMapper.selectShareCardByCardId(cardId);
    }

    /**
     * 查询分享站帖子列表
     * 
     * @param shareCard 分享站帖子
     * @return 分享站帖子
     */
    @Override
    public List<ShareCard> selectShareCardList(ShareCard shareCard)
    {
        return shareCardMapper.selectShareCardList(shareCard);
    }

    /**
     * 新增分享站帖子
     * 
     * @param shareCard 分享站帖子
     * @return 结果
     */
    @Override
    public int insertShareCard(ShareCard shareCard)
    {
        shareCard.setCreateTime(DateTimeUtils.now());
        return shareCardMapper.insertShareCard(shareCard);
    }

    /**
     * 修改分享站帖子
     * 
     * @param shareCard 分享站帖子
     * @return 结果
     */
    @Override
    public int updateShareCard(ShareCard shareCard)
    {
        shareCard.setUpdateTime(DateTimeUtils.now());
        return shareCardMapper.updateShareCard(shareCard);
    }

    /**
     * 批量删除分享站帖子
     * 
     * @param cardIds 需要删除的分享站帖子主键
     * @return 结果
     */
    @Override
    public int deleteShareCardByCardIds(Long[] cardIds)
    {
        return shareCardMapper.deleteShareCardByCardIds(cardIds);
    }

    /**
     * 删除分享站帖子信息
     * 
     * @param cardId 分享站帖子主键
     * @return 结果
     */
    @Override
    public int deleteShareCardByCardId(Long cardId)
    {
        return shareCardMapper.deleteShareCardByCardId(cardId);
    }
}
