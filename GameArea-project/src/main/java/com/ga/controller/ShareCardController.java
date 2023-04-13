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
import com.ga.domain.ShareCard;
import com.ga.service.IShareCardService;

/**
 * 分享站帖子Controller
 * 
 * @author wws
 */
@RestController
@RequestMapping("/ga/shareCard")
public class ShareCardController
{
    @Autowired
    private IShareCardService shareCardService;

    /**
     * 查询分享站帖子列表
     */
    @GetMapping("/list")
    public AjaxResult list(ShareCard shareCard)
    {
        List<ShareCard> list = shareCardService.selectShareCardList(shareCard);
        return AjaxResult.success(list);
    }

    /**
     * 获取分享站帖子详细信息
     */
    @GetMapping(value = "/{cardId}")
    public AjaxResult getInfo(@PathVariable("cardId") Long cardId)
    {
        return AjaxResult.success(shareCardService.selectShareCardByCardId(cardId));
    }

    /**
     * 新增分享站帖子
     */
    @PostMapping
    public AjaxResult add(@RequestBody ShareCard shareCard)
    {
        return AjaxResult.success(shareCardService.insertShareCard(shareCard));
    }

    /**
     * 修改分享站帖子
     */
    @PutMapping
    public AjaxResult edit(@RequestBody ShareCard shareCard)
    {
        return AjaxResult.success(shareCardService.updateShareCard(shareCard));
    }

    /**
     * 删除分享站帖子
     */
	@DeleteMapping("/{cardIds}")
    public AjaxResult remove(@PathVariable Long[] cardIds)
    {
        return AjaxResult.success(shareCardService.deleteShareCardByCardIds(cardIds));
    }
}
