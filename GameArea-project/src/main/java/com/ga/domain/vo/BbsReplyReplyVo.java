package com.ga.domain.vo;

import com.ga.domain.AreaUserInfo;
import com.ga.domain.BbsReplyReply;
import lombok.Data;

@Data
public class BbsReplyReplyVo extends BbsReplyReply {

    private AreaUserInfo userInfo;

    public BbsReplyReplyVo() {}

    public BbsReplyReplyVo(BbsReplyReply brr) {
        setRrId(brr.getRrId());
        setMessage(brr.getMessage());
        setCardId(brr.getCardId());
        setReplyId(brr.getReplyId());
        setReplyTo(brr.getReplyTo());
        setCreateBy(brr.getCreateBy());
        setCreateTime(brr.getCreateTime());
        setUpdateTime(brr.getUpdateTime());
        setStatus(brr.getStatus());
    }
}
