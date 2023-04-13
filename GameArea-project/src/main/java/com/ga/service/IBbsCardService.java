package com.ga.service;

import java.util.List;
import com.ga.domain.BbsCard;

/**
 * 论坛帖子Service接口
 * 
 * @author wws
 * @date 2023-04-13
 */
public interface IBbsCardService 
{
    /**
     * 查询论坛帖子
     * 
     * @param cardId 论坛帖子主键
     * @return 论坛帖子
     */
    public BbsCard selectBbsCardByCardId(Long cardId);

    /**
     * 查询论坛帖子列表
     * 
     * @param bbsCard 论坛帖子
     * @return 论坛帖子集合
     */
    public List<BbsCard> selectBbsCardList(BbsCard bbsCard);

    /**
     * 新增论坛帖子
     * 
     * @param bbsCard 论坛帖子
     * @return 结果
     */
    public int insertBbsCard(BbsCard bbsCard);

    /**
     * 修改论坛帖子
     * 
     * @param bbsCard 论坛帖子
     * @return 结果
     */
    public int updateBbsCard(BbsCard bbsCard);

    /**
     * 批量删除论坛帖子
     * 
     * @param cardIds 需要删除的论坛帖子主键集合
     * @return 结果
     */
    public int deleteBbsCardByCardIds(Long[] cardIds);

    /**
     * 删除论坛帖子信息
     * 
     * @param cardId 论坛帖子主键
     * @return 结果
     */
    public int deleteBbsCardByCardId(Long cardId);
}
