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
import com.ga.domain.AreaModelPermissions;
import com.ga.service.IAreaModelPermissionsService;

/**
 * 平台模块权限分配Controller
 * 
 * @author wws
 */
@RestController
@RequestMapping("/ga/areaPermissions")
public class AreaModelPermissionsController
{
    @Autowired
    private IAreaModelPermissionsService areaModelPermissionsService;

    /**
     * 查询平台模块权限分配列表
     */
    @GetMapping("/list")
    public AjaxResult list(AreaModelPermissions areaModelPermissions)
    {
        List<AreaModelPermissions> list = areaModelPermissionsService.selectAreaModelPermissionsList(areaModelPermissions);
        return AjaxResult.success(list);
    }

    /**
     * 获取平台模块权限分配详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(areaModelPermissionsService.selectAreaModelPermissionsById(id));
    }

    /**
     * 新增平台模块权限分配
     */
    @PostMapping
    public AjaxResult add(@RequestBody AreaModelPermissions areaModelPermissions)
    {
        return AjaxResult.success(areaModelPermissionsService.insertAreaModelPermissions(areaModelPermissions));
    }

    /**
     * 修改平台模块权限分配
     */
    @PutMapping
    public AjaxResult edit(@RequestBody AreaModelPermissions areaModelPermissions)
    {
        return AjaxResult.success(areaModelPermissionsService.updateAreaModelPermissions(areaModelPermissions));
    }

    /**
     * 删除平台模块权限分配
     */
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return AjaxResult.success(areaModelPermissionsService.deleteAreaModelPermissionsByIds(ids));
    }
}
