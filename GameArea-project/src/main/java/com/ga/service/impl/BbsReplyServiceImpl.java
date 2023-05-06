package com.ga.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.ga.domain.BbsReplyReply;
import com.ga.domain.vo.BbsReplyVo;
import com.ga.mapper.AreaUserInfoMapper;
import com.ga.mapper.BbsReplyReplyMapper;
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

    @Autowired
    private BbsReplyReplyMapper bbsReplyReplyMapper;

    @Autowired
    private AreaUserInfoMapper areaUserInfoMapper;

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

    @Override
    public List<BbsReplyVo> selectBbsReplyListWithRReply(BbsReply bbsReply) {
        List<BbsReply> bbsReplyList = bbsReplyMapper.selectBbsReplyList(bbsReply);
        List<BbsReplyVo> bbsReplyVoList = new ArrayList<>();
        for (BbsReply br: bbsReplyList) {
            BbsReplyVo brv = new BbsReplyVo(br);
            BbsReplyReply brr = new BbsReplyReply();
            brr.setReplyId(String.valueOf(br.getReplyId()));

            brv.setReplyReplyList(bbsReplyReplyMapper.selectBbsReplyReplyList(brr));
            brv.setUserInfo(areaUserInfoMapper.selectAreaUserInfoById(Long.parseLong(br.getCreateBy())));
            bbsReplyVoList.add(brv);
        }
        return bbsReplyVoList;
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
        bbsReply.setUpdateTime(bbsReply.getCreateTime());
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
