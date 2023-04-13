package com.ga.mapper;

import java.util.List;
import com.ga.domain.BbsBlock;
import org.apache.ibatis.annotations.Mapper;

/**
 * 论坛板块Mapper接口
 * 
 * @author wws
 * @date 2023-04-13
 */
@Mapper
public interface BbsBlockMapper 
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
     * 删除论坛板块
     * 
     * @param blockId 论坛板块主键
     * @return 结果
     */
    public int deleteBbsBlockByBlockId(Long blockId);

    /**
     * 批量删除论坛板块
     * 
     * @param blockIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBbsBlockByBlockIds(Long[] blockIds);
}
