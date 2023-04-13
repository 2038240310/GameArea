package com.ga.service;

import java.util.List;
import com.ga.domain.BbsBlock;

/**
 * 论坛板块Service接口
 * 
 * @author wws
 * @date 2023-04-13
 */
public interface IBbsBlockService 
{
    /**
     * 查询论坛板块
     * 
     * @param blockId 论坛板块主键
     * @return 论坛板块
     */
    public BbsBlock selectBbsBlockByBlockId(Long blockId);

    /**
     * 查询论坛板块列表
     * 
     * @param bbsBlock 论坛板块
     * @return 论坛板块集合
     */
    public List<BbsBlock> selectBbsBlockList(BbsBlock bbsBlock);

    /**
     * 新增论坛板块
     * 
     * @param bbsBlock 论坛板块
     * @return 结果
     */
    public int insertBbsBlock(BbsBlock bbsBlock);

    /**
     * 修改论坛板块
     * 
     * @param bbsBlock 论坛板块
     * @return 结果
     */
    public int updateBbsBlock(BbsBlock bbsBlock);

    /**
     * 批量删除论坛板块
     * 
     * @param blockIds 需要删除的论坛板块主键集合
     * @return 结果
     */
    public int deleteBbsBlockByBlockIds(Long[] blockIds);

    /**
     * 删除论坛板块信息
     * 
     * @param blockId 论坛板块主键
     * @return 结果
     */
    public int deleteBbsBlockByBlockId(Long blockId);
}
