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
import com.ga.domain.ShareCardReply;
import com.ga.service.IShareCardReplyService;

/**
 * 分享站帖子回复Controller
 * 
 * @author wws
 * @date 2023-04-13
 */
@RestController
@RequestMapping("/ga/shareCardReply")
public class ShareCardReplyController
{
    @Autowired
    private IShareCardReplyService shareCardReplyService;

    /**
     * 查询分享站帖子回复列表
     */
    @GetMapping("/list")
    public AjaxResult list(ShareCardReply shareCardReply)
    {
        List<ShareCardReply> list = shareCardReplyService.selectShareCardReplyList(shareCardReply);
        return AjaxResult.success(list);
    }

    /**
     * 获取分享站帖子回复详细信息
     */
    @GetMapping(value = "/{replyId}")
    public AjaxResult getInfo(@PathVariable("replyId") Long replyId)
    {
        return AjaxResult.success(shareCardReplyService.selectShareCardReplyByReplyId(replyId));
    }

    /**
     * 新增分享站帖子回复
     */
    @PostMapping
    public AjaxResult add(@RequestBody ShareCardReply shareCardReply)
    {
        return AjaxResult.success(shareCardReplyService.insertShareCardReply(shareCardReply));
    }

    /**
     * 修改分享站帖子回复
     */
    @PutMapping
    public AjaxResult edit(@RequestBody ShareCardReply shareCardReply)
    {
        return AjaxResult.success(shareCardReplyService.updateShareCardReply(shareCardReply));
    }

    /**
     * 删除分享站帖子回复
     */
	@DeleteMapping("/{replyIds}")
    public AjaxResult remove(@PathVariable Long[] replyIds)
    {
        return AjaxResult.success(shareCardReplyService.deleteShareCardReplyByReplyIds(replyIds));
    }
}
