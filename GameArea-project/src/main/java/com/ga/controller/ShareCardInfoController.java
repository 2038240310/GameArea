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
import com.ga.domain.ShareCardInfo;
import com.ga.service.IShareCardInfoService;

/**
 * 资源站帖子信息Controller
 * 
 * @author wws
 */
@RestController
@RequestMapping("/ga/shareCardInfo")
public class ShareCardInfoController
{
    @Autowired
    private IShareCardInfoService shareCardInfoService;

    /**
     * 查询资源站帖子信息列表
     */
    @GetMapping("/list")
    public AjaxResult list(ShareCardInfo shareCardInfo)
    {
        List<ShareCardInfo> list = shareCardInfoService.selectShareCardInfoList(shareCardInfo);
        return AjaxResult.success(list);
    }

    /**
     * 获取资源站帖子信息详细信息
     */
    @GetMapping(value = "/{infoId}")
    public AjaxResult getInfo(@PathVariable("infoId") Long infoId)
    {
        return AjaxResult.success(shareCardInfoService.selectShareCardInfoByInfoId(infoId));
    }

    /**
     * 新增资源站帖子信息
     */
    @PostMapping
    public AjaxResult add(@RequestBody ShareCardInfo shareCardInfo)
    {
        return AjaxResult.success(shareCardInfoService.insertShareCardInfo(shareCardInfo));
    }

    /**
     * 修改资源站帖子信息
     */
    @PutMapping
    public AjaxResult edit(@RequestBody ShareCardInfo shareCardInfo)
    {
        return AjaxResult.success(shareCardInfoService.updateShareCardInfo(shareCardInfo));
    }

    /**
     * 删除资源站帖子信息
     */
	@DeleteMapping("/{infoIds}")
    public AjaxResult remove(@PathVariable Long[] infoIds)
    {
        return AjaxResult.success(shareCardInfoService.deleteShareCardInfoByInfoIds(infoIds));
    }
}
