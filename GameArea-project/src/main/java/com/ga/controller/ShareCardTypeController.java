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
import com.ga.domain.ShareCardType;
import com.ga.service.IShareCardTypeService;

/**
 * 分享站帖子类型Controller
 * 
 * @author wws
 */
@RestController
@RequestMapping("/ga/shareCardType")
public class ShareCardTypeController
{
    @Autowired
    private IShareCardTypeService shareCardTypeService;

    /**
     * 查询分享站帖子类型列表
     */
    @GetMapping("/list")
    public AjaxResult list(ShareCardType shareCardType)
    {
        List<ShareCardType> list = shareCardTypeService.selectShareCardTypeList(shareCardType);
        return AjaxResult.success(list);
    }

    /**
     * 获取分享站帖子类型详细信息
     */
    @GetMapping(value = "/{typeId}")
    public AjaxResult getInfo(@PathVariable("typeId") Long typeId)
    {
        return AjaxResult.success(shareCardTypeService.selectShareCardTypeByTypeId(typeId));
    }

    /**
     * 新增分享站帖子类型
     */
    @PostMapping
    public AjaxResult add(@RequestBody ShareCardType shareCardType)
    {
        return AjaxResult.success(shareCardTypeService.insertShareCardType(shareCardType));
    }

    /**
     * 修改分享站帖子类型
     */
    @PutMapping
    public AjaxResult edit(@RequestBody ShareCardType shareCardType)
    {
        return AjaxResult.success(shareCardTypeService.updateShareCardType(shareCardType));
    }

    /**
     * 删除分享站帖子类型
     */
	@DeleteMapping("/{typeIds}")
    public AjaxResult remove(@PathVariable Long[] typeIds)
    {
        return AjaxResult.success(shareCardTypeService.deleteShareCardTypeByTypeIds(typeIds));
    }
}
