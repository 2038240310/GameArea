package com.ga.domain.vo;

import com.ga.domain.AreaUserInfo;
import com.ga.domain.BbsReply;
import lombok.Data;

import java.util.List;

@Data
public class BbsReplyVo extends BbsReply {
    private List<BbsReplyReplyVo> replyReplyVoList;

    private AreaUserInfo userInfo;

    public BbsReplyVo() {}

    public BbsReplyVo(BbsReply bbsReply) {
        setReplyId(bbsReply.getReplyId());
        setMessage(bbsReply.getMessage());
        setCardId(bbsReply.getCardId());
        setCreateBy(bbsReply.getCreateBy());
        setCreateTime(bbsReply.getCreateTime());
        setUpdateTime(bbsReply.getUpdateTime());
        setStatus(bbsReply.getStatus());
    }
}
