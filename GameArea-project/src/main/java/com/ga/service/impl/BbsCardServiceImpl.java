package com.ga.service.impl;

import java.util.List;

import com.ga.utils.DateTimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ga.mapper.BbsCardMapper;
import com.ga.domain.BbsCard;
import com.ga.service.IBbsCardService;

/**
 * 论坛帖子Service业务层处理
 * 
 * @author wws
 * @date 2023-04-13
 */
@Service
public class BbsCardServiceImpl implements IBbsCardService 
{
    @Autowired
    private BbsCardMapper bbsCardMapper;

    /**
     * 查询论坛帖子
     * 
     * @param cardId 论坛帖子主键
     * @return 论坛帖子
     */
    @Override
    public BbsCard selectBbsCardByCardId(Long cardId)
    {
        return bbsCardMapper.selectBbsCardByCardId(cardId);
    }

    /**
     * 查询论坛帖子列表
     * 
     * @param bbsCard 论坛帖子
     * @return 论坛帖子
     */
    @Override
    public List<BbsCard> selectBbsCardList(BbsCard bbsCard)
    {
        return bbsCardMapper.selectBbsCardList(bbsCard);
    }

    /**
     * 新增论坛帖子
     * 
     * @param bbsCard 论坛帖子
     * @return 结果
     */
    @Override
    public int insertBbsCard(BbsCard bbsCard)
    {
        bbsCard.setCreateTime(DateTimeUtils.now());
        return bbsCardMapper.insertBbsCard(bbsCard);
    }

    /**
     * 修改论坛帖子
     * 
     * @param bbsCard 论坛帖子
     * @return 结果
     */
    @Override
    public int updateBbsCard(BbsCard bbsCard)
    {
        bbsCard.setUpdateTime(DateTimeUtils.now());
        return bbsCardMapper.updateBbsCard(bbsCard);
    }

    /**
     * 批量删除论坛帖子
     * 
     * @param cardIds 需要删除的论坛帖子主键
     * @return 结果
     */
    @Override
    public int deleteBbsCardByCardIds(Long[] cardIds)
    {
        return bbsCardMapper.deleteBbsCardByCardIds(cardIds);
    }

    /**
     * 删除论坛帖子信息
     * 
     * @param cardId 论坛帖子主键
     * @return 结果
     */
    @Override
    public int deleteBbsCardByCardId(Long cardId)
    {
        return bbsCardMapper.deleteBbsCardByCardId(cardId);
    }
}
