package com.ga.service.impl;

import java.util.List;

import com.ga.utils.DateTimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ga.mapper.BbsBlockMapper;
import com.ga.domain.BbsBlock;
import com.ga.service.IBbsBlockService;

/**
 * 论坛板块Service业务层处理
 * 
 * @author wws
 * @date 2023-04-13
 */
@Service
public class BbsBlockServiceImpl implements IBbsBlockService 
{
    @Autowired
    private BbsBlockMapper bbsBlockMapper;

    /**
     * 查询论坛板块
     * 
     * @param blockId 论坛板块主键
     * @return 论坛板块
     */
    @Override
    public BbsBlock selectBbsBlockByBlockId(Long blockId)
    {
        return bbsBlockMapper.selectBbsBlockByBlockId(blockId);
    }

    /**
     * 查询论坛板块列表
     * 
     * @param bbsBlock 论坛板块
     * @return 论坛板块
     */
    @Override
    public List<BbsBlock> selectBbsBlockList(BbsBlock bbsBlock)
    {
        return bbsBlockMapper.selectBbsBlockList(bbsBlock);
    }

    /**
     * 新增论坛板块
     * 
     * @param bbsBlock 论坛板块
     * @return 结果
     */
    @Override
    public int insertBbsBlock(BbsBlock bbsBlock)
    {
        bbsBlock.setCreateTime(DateTimeUtils.now());
        return bbsBlockMapper.insertBbsBlock(bbsBlock);
    }

    /**
     * 修改论坛板块
     * 
     * @param bbsBlock 论坛板块
     * @return 结果
     */
    @Override
    public int updateBbsBlock(BbsBlock bbsBlock)
    {
        bbsBlock.setUpdateTime(DateTimeUtils.now());
        return bbsBlockMapper.updateBbsBlock(bbsBlock);
    }

    /**
     * 批量删除论坛板块
     * 
     * @param blockIds 需要删除的论坛板块主键
     * @return 结果
     */
    @Override
    public int deleteBbsBlockByBlockIds(Long[] blockIds)
    {
        return bbsBlockMapper.deleteBbsBlockByBlockIds(blockIds);
    }

    /**
     * 删除论坛板块信息
     * 
     * @param blockId 论坛板块主键
     * @return 结果
     */
    @Override
    public int deleteBbsBlockByBlockId(Long blockId)
    {
        return bbsBlockMapper.deleteBbsBlockByBlockId(blockId);
    }
}
