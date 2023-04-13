package com.ga.service.impl;

import java.util.List;

import com.ga.utils.DateTimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ga.mapper.BbsReplyReplyMapper;
import com.ga.domain.BbsReplyReply;
import com.ga.service.IBbsReplyReplyService;

/**
 * 论坛帖子二级回复消息Service业务层处理
 * 
 * @author wws
 * @date 2023-04-13
 */
@Service
public class BbsReplyReplyServiceImpl implements IBbsReplyReplyService 
{
    @Autowired
    private BbsReplyReplyMapper bbsReplyReplyMapper;

    /**
     * 查询论坛帖子二级回复消息
     * 
     * @param rrId 论坛帖子二级回复消息主键
     * @return 论坛帖子二级回复消息
     */
    @Override
    public BbsReplyReply selectBbsReplyReplyByRrId(Long rrId)
    {
        return bbsReplyReplyMapper.selectBbsReplyReplyByRrId(rrId);
    }

    /**
     * 查询论坛帖子二级回复消息列表
     * 
     * @param bbsReplyReply 论坛帖子二级回复消息
     * @return 论坛帖子二级回复消息
     */
    @Override
    public List<BbsReplyReply> selectBbsReplyReplyList(BbsReplyReply bbsReplyReply)
    {
        return bbsReplyReplyMapper.selectBbsReplyReplyList(bbsReplyReply);
    }

    /**
     * 新增论坛帖子二级回复消息
     * 
     * @param bbsReplyReply 论坛帖子二级回复消息
     * @return 结果
     */
    @Override
    public int insertBbsReplyReply(BbsReplyReply bbsReplyReply)
    {
        bbsReplyReply.setCreateTime(DateTimeUtils.now());
        return bbsReplyReplyMapper.insertBbsReplyReply(bbsReplyReply);
    }

    /**
     * 修改论坛帖子二级回复消息
     * 
     * @param bbsReplyReply 论坛帖子二级回复消息
     * @return 结果
     */
    @Override
    public int updateBbsReplyReply(BbsReplyReply bbsReplyReply)
    {
        bbsReplyReply.setUpdateTime(DateTimeUtils.now());
        return bbsReplyReplyMapper.updateBbsReplyReply(bbsReplyReply);
    }

    /**
     * 批量删除论坛帖子二级回复消息
     * 
     * @param rrIds 需要删除的论坛帖子二级回复消息主键
     * @return 结果
     */
    @Override
    public int deleteBbsReplyReplyByRrIds(Long[] rrIds)
    {
        return bbsReplyReplyMapper.deleteBbsReplyReplyByRrIds(rrIds);
    }

    /**
     * 删除论坛帖子二级回复消息信息
     * 
     * @param rrId 论坛帖子二级回复消息主键
     * @return 结果
     */
    @Override
    public int deleteBbsReplyReplyByRrId(Long rrId)
    {
        return bbsReplyReplyMapper.deleteBbsReplyReplyByRrId(rrId);
    }
}
