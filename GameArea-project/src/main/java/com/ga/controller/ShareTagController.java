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
import com.ga.domain.ShareTag;
import com.ga.service.IShareTagService;

/**
 * 分享站标签管理Controller
 * 
 * @author wws
 * @date 2023-04-13
 */
@RestController
@RequestMapping("/ga/shareTag")
public class ShareTagController
{
    @Autowired
    private IShareTagService shareTagService;

    /**
     * 查询分享站标签管理列表
     */
    @GetMapping("/list")
    public AjaxResult list(ShareTag shareTag)
    {
        List<ShareTag> list = shareTagService.selectShareTagList(shareTag);
        return AjaxResult.success(list);
    }

    /**
     * 获取分享站标签管理详细信息
     */
    @GetMapping(value = "/{tagId}")
    public AjaxResult getInfo(@PathVariable("tagId") Long tagId)
    {
        return AjaxResult.success(shareTagService.selectShareTagByTagId(tagId));
    }

    /**
     * 新增分享站标签管理
     */
    @PostMapping
    public AjaxResult add(@RequestBody ShareTag shareTag)
    {
        return AjaxResult.success(shareTagService.insertShareTag(shareTag));
    }

    /**
     * 修改分享站标签管理
     */
    @PutMapping
    public AjaxResult edit(@RequestBody ShareTag shareTag)
    {
        return AjaxResult.success(shareTagService.updateShareTag(shareTag));
    }

    /**
     * 删除分享站标签管理
     */
	@DeleteMapping("/{tagIds}")
    public AjaxResult remove(@PathVariable Long[] tagIds)
    {
        return AjaxResult.success(shareTagService.deleteShareTagByTagIds(tagIds));
    }
}
