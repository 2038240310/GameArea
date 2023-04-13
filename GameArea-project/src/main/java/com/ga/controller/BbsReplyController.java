package com.ga.controller;

import java.util.List;

import com.ga.domain.msg.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ga.domain.BbsReply;
import com.ga.service.IBbsReplyService;

/**
 * 论坛帖子回复信息Controller
 * 
 * @author wws
 * @date 2023-04-13
 */
@RestController
@RequestMapping("/ga/bbsReply")
public class BbsReplyController
{
    @Autowired
    private IBbsReplyService bbsReplyService;

    /**
     * 查询论坛帖子回复信息列表
     */
    @GetMapping("/list")
    public AjaxResult list(BbsReply bbsReply)
    {
        List<BbsReply> list = bbsReplyService.selectBbsReplyList(bbsReply);
        return AjaxResult.success(list);
    }

    /**
     * 获取论坛帖子回复信息详细信息
     */
    @GetMapping(value = "/{replyId}")
    public AjaxResult getInfo(@PathVariable("replyId") Long replyId)
    {
        return AjaxResult.success(bbsReplyService.selectBbsReplyByReplyId(replyId));
    }

    /**
     * 新增论坛帖子回复信息
     */
    @PostMapping
    public AjaxResult add(@RequestBody BbsReply bbsReply)
    {
        return AjaxResult.success(bbsReplyService.insertBbsReply(bbsReply));
    }

    /**
     * 修改论坛帖子回复信息
     */
    @PutMapping
    public AjaxResult edit(@RequestBody BbsReply bbsReply)
    {
        return AjaxResult.success(bbsReplyService.updateBbsReply(bbsReply));
    }

    /**
     * 删除论坛帖子回复信息
     */
	@DeleteMapping("/{replyIds}")
    public AjaxResult remove(@PathVariable Long[] replyIds)
    {
        return AjaxResult.success(bbsReplyService.deleteBbsReplyByReplyIds(replyIds));
    }
}
