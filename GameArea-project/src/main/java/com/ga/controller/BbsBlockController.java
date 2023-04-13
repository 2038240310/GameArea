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
import com.ga.domain.BbsBlock;
import com.ga.service.IBbsBlockService;

/**
 * 论坛板块Controller
 * 
 * @author wws
 */
@RestController
@RequestMapping("/ga/bbsBlock")
public class BbsBlockController
{
    @Autowired
    private IBbsBlockService bbsBlockService;

    /**
     * 查询论坛板块列表
     */
    @GetMapping("/list")
    public AjaxResult list(BbsBlock bbsBlock)
    {
        List<BbsBlock> list = bbsBlockService.selectBbsBlockList(bbsBlock);
        return AjaxResult.success(list);
    }

    /**
     * 获取论坛板块详细信息
     */
    @GetMapping(value = "/{blockId}")
    public AjaxResult getInfo(@PathVariable("blockId") Long blockId)
    {
        return AjaxResult.success(bbsBlockService.selectBbsBlockByBlockId(blockId));
    }

    /**
     * 新增论坛板块
     */
    @PostMapping
    public AjaxResult add(@RequestBody BbsBlock bbsBlock)
    {
        return AjaxResult.success(bbsBlockService.insertBbsBlock(bbsBlock));
    }

    /**
     * 修改论坛板块
     */
    @PutMapping
    public AjaxResult edit(@RequestBody BbsBlock bbsBlock)
    {
        return AjaxResult.success(bbsBlockService.updateBbsBlock(bbsBlock));
    }

    /**
     * 删除论坛板块
     */
	@DeleteMapping("/{blockIds}")
    public AjaxResult remove(@PathVariable Long[] blockIds)
    {
        return AjaxResult.success(bbsBlockService.deleteBbsBlockByBlockIds(blockIds));
    }
}
