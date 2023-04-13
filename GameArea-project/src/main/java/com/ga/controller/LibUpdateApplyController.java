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
import com.ga.domain.LibUpdateApply;
import com.ga.service.ILibUpdateApplyService;

/**
 * 资料库操作申请单Controller
 * 
 * @author wws
 */
@RestController
@RequestMapping("/ga/libUpdateApply")
public class LibUpdateApplyController
{
    @Autowired
    private ILibUpdateApplyService libUpdateApplyService;

    /**
     * 查询资料库操作申请单列表
     */
    @GetMapping("/list")
    public AjaxResult list(LibUpdateApply libUpdateApply)
    {
        List<LibUpdateApply> list = libUpdateApplyService.selectLibUpdateApplyList(libUpdateApply);
        return AjaxResult.success(list);
    }

    /**
     * 获取资料库操作申请单详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(libUpdateApplyService.selectLibUpdateApplyById(id));
    }

    /**
     * 新增资料库操作申请单
     */
    @PostMapping
    public AjaxResult add(@RequestBody LibUpdateApply libUpdateApply)
    {
        return AjaxResult.success(libUpdateApplyService.insertLibUpdateApply(libUpdateApply));
    }

    /**
     * 修改资料库操作申请单
     */
    @PutMapping
    public AjaxResult edit(@RequestBody LibUpdateApply libUpdateApply)
    {
        return AjaxResult.success(libUpdateApplyService.updateLibUpdateApply(libUpdateApply));
    }

    /**
     * 删除资料库操作申请单
     */
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return AjaxResult.success(libUpdateApplyService.deleteLibUpdateApplyByIds(ids));
    }
}
