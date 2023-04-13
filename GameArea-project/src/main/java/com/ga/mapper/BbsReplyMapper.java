package com.ga.mapper;

import java.util.List;
import com.ga.domain.BbsReply;
import org.apache.ibatis.annotations.Mapper;

/**
 * 论坛帖子回复信息Mapper接口
 * 
 * @author wws
 * @date 2023-04-13
 */
@Mapper
public interface BbsReplyMapper 
{
    /**
     * 查询论坛帖子回复信息
     * 
     * @param replyId 论坛帖子回复信息主键
     * @return 论坛帖子回复信息
     */
    public BbsReply selectBbsReplyByReplyId(Long replyId);

    /**
     * 查询论坛帖子回复信息列表
     * 
     * @param bbsReply 论坛帖子回复信息
     * @return 论坛帖子回复信息集合
     */
    public List<BbsReply> selectBbsReplyList(BbsReply bbsReply);

    /**
     * 新增论坛帖子回复信息
     * 
     * @param bbsReply 论坛帖子回复信息
     * @return 结果
     */
    public int insertBbsReply(BbsReply bbsReply);

    /**
     * 修改论坛帖子回复信息
     * 
     * @param bbsReply 论坛帖子回复信息
     * @return 结果
     */
    public int updateBbsReply(BbsReply bbsReply);

    /**
     * 删除论坛帖子回复信息
     * 
     * @param replyId 论坛帖子回复信息主键
     * @return 结果
     */
    public int deleteBbsReplyByReplyId(Long replyId);

    /**
     * 批量删除论坛帖子回复信息
     * 
     * @param replyIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBbsReplyByReplyIds(Long[] replyIds);
}
