package com.ga.mapper;

import java.util.List;
import com.ga.domain.BbsCard;
import org.apache.ibatis.annotations.Mapper;

/**
 * 论坛帖子Mapper接口
 * 
 * @author wws
 * @date 2023-04-13
 */
@Mapper
public interface BbsCardMapper 
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
     * 删除论坛帖子
     * 
     * @param cardId 论坛帖子主键
     * @return 结果
     */
    public int deleteBbsCardByCardId(Long cardId);

    /**
     * 批量删除论坛帖子
     * 
     * @param cardIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBbsCardByCardIds(Long[] cardIds);
}
