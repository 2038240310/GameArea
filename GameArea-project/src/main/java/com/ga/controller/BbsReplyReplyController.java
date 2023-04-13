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
import com.ga.domain.BbsReplyReply;
import com.ga.service.IBbsReplyReplyService;

/**
 * 论坛帖子二级回复消息Controller
 * 
 * @author wws
 */
@RestController
@RequestMapping("/ga/bbsReplyReply")
public class BbsReplyReplyController
{
    @Autowired
    private IBbsReplyReplyService bbsReplyReplyService;

    /**
     * 查询论坛帖子二级回复消息列表
     */
    @GetMapping("/list")
    public AjaxResult list(BbsReplyReply bbsReplyReply)
    {
        List<BbsReplyReply> list = bbsReplyReplyService.selectBbsReplyReplyList(bbsReplyReply);
        return AjaxResult.success(list);
    }

    /**
     * 获取论坛帖子二级回复消息详细信息
     */
    @GetMapping(value = "/{rrId}")
    public AjaxResult getInfo(@PathVariable("rrId") Long rrId)
    {
        return AjaxResult.success(bbsReplyReplyService.selectBbsReplyReplyByRrId(rrId));
    }

    /**
     * 新增论坛帖子二级回复消息
     */
    @PostMapping
    public AjaxResult add(@RequestBody BbsReplyReply bbsReplyReply)
    {
        return AjaxResult.success(bbsReplyReplyService.insertBbsReplyReply(bbsReplyReply));
    }

    /**
     * 修改论坛帖子二级回复消息
     */
    @PutMapping
    public AjaxResult edit(@RequestBody BbsReplyReply bbsReplyReply)
    {
        return AjaxResult.success(bbsReplyReplyService.updateBbsReplyReply(bbsReplyReply));
    }

    /**
     * 删除论坛帖子二级回复消息
     */
	@DeleteMapping("/{rrIds}")
    public AjaxResult remove(@PathVariable Long[] rrIds)
    {
        return AjaxResult.success(bbsReplyReplyService.deleteBbsReplyReplyByRrIds(rrIds));
    }
}
