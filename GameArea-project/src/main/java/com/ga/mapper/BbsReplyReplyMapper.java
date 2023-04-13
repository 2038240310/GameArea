package com.ga.mapper;

import java.util.List;
import com.ga.domain.BbsReplyReply;
import org.apache.ibatis.annotations.Mapper;

/**
 * 论坛帖子二级回复消息Mapper接口
 * 
 * @author wws
 * @date 2023-04-13
 */
@Mapper
public interface BbsReplyReplyMapper 
{
    /**
     * 查询论坛帖子二级回复消息
     * 
     * @param rrId 论坛帖子二级回复消息主键
     * @return 论坛帖子二级回复消息
     */
    public BbsReplyReply selectBbsReplyReplyByRrId(Long rrId);

    /**
     * 查询论坛帖子二级回复消息列表
     * 
     * @param bbsReplyReply 论坛帖子二级回复消息
     * @return 论坛帖子二级回复消息集合
     */
    public List<BbsReplyReply> selectBbsReplyReplyList(BbsReplyReply bbsReplyReply);

    /**
     * 新增论坛帖子二级回复消息
     * 
     * @param bbsReplyReply 论坛帖子二级回复消息
     * @return 结果
     */
    public int insertBbsReplyReply(BbsReplyReply bbsReplyReply);

    /**
     * 修改论坛帖子二级回复消息
     * 
     * @param bbsReplyReply 论坛帖子二级回复消息
     * @return 结果
     */
    public int updateBbsReplyReply(BbsReplyReply bbsReplyReply);

    /**
     * 删除论坛帖子二级回复消息
     * 
     * @param rrId 论坛帖子二级回复消息主键
     * @return 结果
     */
    public int deleteBbsReplyReplyByRrId(Long rrId);

    /**
     * 批量删除论坛帖子二级回复消息
     * 
     * @param rrIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBbsReplyReplyByRrIds(Long[] rrIds);
}
