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
import com.ga.domain.ShareCardTag;
import com.ga.service.IShareCardTagService;

/**
 * 资源站帖子-标签关联Controller
 * 
 * @author wws
 * @date 2023-04-13
 */
@RestController
@RequestMapping("/ga/shareCardTag")
public class ShareCardTagController
{
    @Autowired
    private IShareCardTagService shareCardTagService;

    /**
     * 查询资源站帖子-标签关联列表
     */
    @GetMapping("/list")
    public AjaxResult list(ShareCardTag shareCardTag)
    {
        List<ShareCardTag> list = shareCardTagService.selectShareCardTagList(shareCardTag);
        return AjaxResult.success(list);
    }

    /**
     * 获取资源站帖子-标签关联详细信息
     */
    @GetMapping(value = "/{relId}")
    public AjaxResult getInfo(@PathVariable("relId") Long relId)
    {
        return AjaxResult.success(shareCardTagService.selectShareCardTagByRelId(relId));
    }

    /**
     * 新增资源站帖子-标签关联
     */
    @PostMapping
    public AjaxResult add(@RequestBody ShareCardTag shareCardTag)
    {
        return AjaxResult.success(shareCardTagService.insertShareCardTag(shareCardTag));
    }

    /**
     * 修改资源站帖子-标签关联
     */
    @PutMapping
    public AjaxResult edit(@RequestBody ShareCardTag shareCardTag)
    {
        return AjaxResult.success(shareCardTagService.updateShareCardTag(shareCardTag));
    }

    /**
     * 删除资源站帖子-标签关联
     */
	@DeleteMapping("/{relIds}")
    public AjaxResult remove(@PathVariable Long[] relIds)
    {
        return AjaxResult.success(shareCardTagService.deleteShareCardTagByRelIds(relIds));
    }
}
