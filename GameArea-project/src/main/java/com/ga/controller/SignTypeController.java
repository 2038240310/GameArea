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
import com.ga.domain.SignType;
import com.ga.service.ISignTypeService;

/**
 * 公告版类型管理Controller
 * 
 * @author wws
 */
@RestController
@RequestMapping("/ga/signType")
public class SignTypeController
{
    @Autowired
    private ISignTypeService signTypeService;

    /**
     * 查询公告版类型管理列表
     */
    @GetMapping("/list")
    public AjaxResult list(SignType signType)
    {
        List<SignType> list = signTypeService.selectSignTypeList(signType);
        return AjaxResult.success(list);
    }

    /**
     * 获取公告版类型管理详细信息
     */
    @GetMapping(value = "/{typeId}")
    public AjaxResult getInfo(@PathVariable("typeId") Long typeId)
    {
        return AjaxResult.success(signTypeService.selectSignTypeByTypeId(typeId));
    }

    /**
     * 新增公告版类型管理
     */
    @PostMapping
    public AjaxResult add(@RequestBody SignType signType)
    {
        return AjaxResult.success(signTypeService.insertSignType(signType));
    }

    /**
     * 修改公告版类型管理
     */
    @PutMapping
    public AjaxResult edit(@RequestBody SignType signType)
    {
        return AjaxResult.success(signTypeService.updateSignType(signType));
    }

    /**
     * 删除公告版类型管理
     */
	@DeleteMapping("/{typeIds}")
    public AjaxResult remove(@PathVariable Long[] typeIds)
    {
        return AjaxResult.success(signTypeService.deleteSignTypeByTypeIds(typeIds));
    }
}
