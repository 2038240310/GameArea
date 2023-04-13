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
import com.ga.domain.BbsCard;
import com.ga.service.IBbsCardService;

/**
 * 论坛帖子Controller
 * 
 * @author wws
 */
@RestController
@RequestMapping("/ga/bbsCard")
public class BbsCardController
{
    @Autowired
    private IBbsCardService bbsCardService;

    /**
     * 查询论坛帖子列表
     */
    @GetMapping("/list")
    public AjaxResult list(BbsCard bbsCard)
    {
        List<BbsCard> list = bbsCardService.selectBbsCardList(bbsCard);
        return AjaxResult.success(list);
    }

    /**
     * 获取论坛帖子详细信息
     */
    @GetMapping(value = "/{cardId}")
    public AjaxResult getInfo(@PathVariable("cardId") Long cardId)
    {
        return AjaxResult.success(bbsCardService.selectBbsCardByCardId(cardId));
    }

    /**
     * 新增论坛帖子
     */
    @PostMapping
    public AjaxResult add(@RequestBody BbsCard bbsCard)
    {
        return AjaxResult.success(bbsCardService.insertBbsCard(bbsCard));
    }

    /**
     * 修改论坛帖子
     */
    @PutMapping
    public AjaxResult edit(@RequestBody BbsCard bbsCard)
    {
        return AjaxResult.success(bbsCardService.updateBbsCard(bbsCard));
    }

    /**
     * 删除论坛帖子
     */
	@DeleteMapping("/{cardIds}")
    public AjaxResult remove(@PathVariable Long[] cardIds)
    {
        return AjaxResult.success(bbsCardService.deleteBbsCardByCardIds(cardIds));
    }
}
