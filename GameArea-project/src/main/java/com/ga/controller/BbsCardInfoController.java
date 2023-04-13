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
import com.ga.domain.BbsCardInfo;
import com.ga.service.IBbsCardInfoService;

/**
 * 论坛帖子信息Controller
 * 
 * @author wws
 */
@RestController
@RequestMapping("/ga/bbsCardInfo")
public class BbsCardInfoController
{
    @Autowired
    private IBbsCardInfoService bbsCardInfoService;

    /**
     * 查询论坛帖子信息列表
     */
    @GetMapping("/list")
    public AjaxResult list(BbsCardInfo bbsCardInfo)
    {
        List<BbsCardInfo> list = bbsCardInfoService.selectBbsCardInfoList(bbsCardInfo);
        return AjaxResult.success(list);
    }

    /**
     * 获取论坛帖子信息详细信息
     */
    @GetMapping(value = "/{infoId}")
    public AjaxResult getInfo(@PathVariable("infoId") Long infoId)
    {
        return AjaxResult.success(bbsCardInfoService.selectBbsCardInfoByInfoId(infoId));
    }

    /**
     * 新增论坛帖子信息
     */
    @PostMapping
    public AjaxResult add(@RequestBody BbsCardInfo bbsCardInfo)
    {
        return AjaxResult.success(bbsCardInfoService.insertBbsCardInfo(bbsCardInfo));
    }

    /**
     * 修改论坛帖子信息
     */
    @PutMapping
    public AjaxResult edit(@RequestBody BbsCardInfo bbsCardInfo)
    {
        return AjaxResult.success(bbsCardInfoService.updateBbsCardInfo(bbsCardInfo));
    }

    /**
     * 删除论坛帖子信息
     */
	@DeleteMapping("/{infoIds}")
    public AjaxResult remove(@PathVariable Long[] infoIds)
    {
        return AjaxResult.success(bbsCardInfoService.deleteBbsCardInfoByInfoIds(infoIds));
    }
}
