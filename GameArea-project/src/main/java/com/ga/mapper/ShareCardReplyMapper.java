package com.ga.mapper;

import java.util.List;
import com.ga.domain.ShareCardReply;
import org.apache.ibatis.annotations.Mapper;

/**
 * 分享站帖子回复Mapper接口
 * 
 * @author wws
 * @date 2023-04-13
 */
@Mapper
public interface ShareCardReplyMapper 
{
    /**
     * 查询分享站帖子回复
     * 
     * @param replyId 分享站帖子回复主键
     * @return 分享站帖子回复
     */
    public ShareCardReply selectShareCardReplyByReplyId(Long replyId);

    /**
     * 查询分享站帖子回复列表
     * 
     * @param shareCardReply 分享站帖子回复
     * @return 分享站帖子回复集合
     */
    public List<ShareCardReply> selectShareCardReplyList(ShareCardReply shareCardReply);

    /**
     * 新增分享站帖子回复
     * 
     * @param shareCardReply 分享站帖子回复
     * @return 结果
     */
    public int insertShareCardReply(ShareCardReply shareCardReply);

    /**
     * 修改分享站帖子回复
     * 
     * @param shareCardReply 分享站帖子回复
     * @return 结果
     */
    public int updateShareCardReply(ShareCardReply shareCardReply);

    /**
     * 删除分享站帖子回复
     * 
     * @param replyId 分享站帖子回复主键
     * @return 结果
     */
    public int deleteShareCardReplyByReplyId(Long replyId);

    /**
     * 批量删除分享站帖子回复
     * 
     * @param replyIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteShareCardReplyByReplyIds(Long[] replyIds);
}
