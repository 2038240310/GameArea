package com.ga.service.impl;

import java.util.List;

import com.ga.utils.DateTimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ga.mapper.BbsReplyMapper;
import com.ga.domain.BbsReply;
import com.ga.service.IBbsReplyService;

/**
 * 论坛帖子回复信息Service业务层处理
 * 
 * @author wws
 * @date 2023-04-13
 */
@Service
public class BbsReplyServiceImpl implements IBbsReplyService 
{
    @Autowired
    private BbsReplyMapper bbsReplyMapper;

    /**
     * 查询论坛帖子回复信息
     * 
     * @param replyId 论坛帖子回复信息主键
     * @return 论坛帖子回复信息
     */
    @Override
    public BbsReply selectBbsReplyByReplyId(Long replyId)
    {
        return bbsReplyMapper.selectBbsReplyByReplyId(replyId);
    }

    /**
     * 查询论坛帖子回复信息列表
     * 
     * @param bbsReply 论坛帖子回复信息
     * @return 论坛帖子回复信息
     */
    @Override
    public List<BbsReply> selectBbsReplyList(BbsReply bbsReply)
    {
        return bbsReplyMapper.selectBbsReplyList(bbsReply);
    }

    /**
     * 新增论坛帖子回复信息
     * 
     * @param bbsReply 论坛帖子回复信息
     * @return 结果
     */
    @Override
    public int insertBbsReply(BbsReply bbsReply)
    {
        bbsReply.setCreateTime(DateTimeUtils.now());
        return bbsReplyMapper.insertBbsReply(bbsReply);
    }

    /**
     * 修改论坛帖子回复信息
     * 
     * @param bbsReply 论坛帖子回复信息
     * @return 结果
     */
    @Override
    public int updateBbsReply(BbsReply bbsReply)
    {
        bbsReply.setUpdateTime(DateTimeUtils.now());
        return bbsReplyMapper.updateBbsReply(bbsReply);
    }

    /**
     * 批量删除论坛帖子回复信息
     * 
     * @param replyIds 需要删除的论坛帖子回复信息主键
     * @return 结果
     */
    @Override
    public int deleteBbsReplyByReplyIds(Long[] replyIds)
    {
        return bbsReplyMapper.deleteBbsReplyByReplyIds(replyIds);
    }

    /**
     * 删除论坛帖子回复信息信息
     * 
     * @param replyId 论坛帖子回复信息主键
     * @return 结果
     */
    @Override
    public int deleteBbsReplyByReplyId(Long replyId)
    {
        return bbsReplyMapper.deleteBbsReplyByReplyId(replyId);
    }
}
