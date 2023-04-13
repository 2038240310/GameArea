package com.ga.service.impl;

import java.util.List;

import com.ga.utils.DateTimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ga.mapper.ShareCardReplyMapper;
import com.ga.domain.ShareCardReply;
import com.ga.service.IShareCardReplyService;

/**
 * 分享站帖子回复Service业务层处理
 * 
 * @author wws
 * @date 2023-04-13
 */
@Service
public class ShareCardReplyServiceImpl implements IShareCardReplyService 
{
    @Autowired
    private ShareCardReplyMapper shareCardReplyMapper;

    /**
     * 查询分享站帖子回复
     * 
     * @param replyId 分享站帖子回复主键
     * @return 分享站帖子回复
     */
    @Override
    public ShareCardReply selectShareCardReplyByReplyId(Long replyId)
    {
        return shareCardReplyMapper.selectShareCardReplyByReplyId(replyId);
    }

    /**
     * 查询分享站帖子回复列表
     * 
     * @param shareCardReply 分享站帖子回复
     * @return 分享站帖子回复
     */
    @Override
    public List<ShareCardReply> selectShareCardReplyList(ShareCardReply shareCardReply)
    {
        return shareCardReplyMapper.selectShareCardReplyList(shareCardReply);
    }

    /**
     * 新增分享站帖子回复
     * 
     * @param shareCardReply 分享站帖子回复
     * @return 结果
     */
    @Override
    public int insertShareCardReply(ShareCardReply shareCardReply)
    {
        shareCardReply.setCreateTime(DateTimeUtils.now());
        return shareCardReplyMapper.insertShareCardReply(shareCardReply);
    }

    /**
     * 修改分享站帖子回复
     * 
     * @param shareCardReply 分享站帖子回复
     * @return 结果
     */
    @Override
    public int updateShareCardReply(ShareCardReply shareCardReply)
    {
        shareCardReply.setUpdateTime(DateTimeUtils.now());
        return shareCardReplyMapper.updateShareCardReply(shareCardReply);
    }

    /**
     * 批量删除分享站帖子回复
     * 
     * @param replyIds 需要删除的分享站帖子回复主键
     * @return 结果
     */
    @Override
    public int deleteShareCardReplyByReplyIds(Long[] replyIds)
    {
        return shareCardReplyMapper.deleteShareCardReplyByReplyIds(replyIds);
    }

    /**
     * 删除分享站帖子回复信息
     * 
     * @param replyId 分享站帖子回复主键
     * @return 结果
     */
    @Override
    public int deleteShareCardReplyByReplyId(Long replyId)
    {
        return shareCardReplyMapper.deleteShareCardReplyByReplyId(replyId);
    }
}
