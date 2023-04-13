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
import com.ga.domain.BbsUserPermissions;
import com.ga.service.IBbsUserPermissionsService;

/**
 * 帖子用户权限配置Controller
 * 
 * @author wws
 */
@RestController
@RequestMapping("/ga/bbsUserPermissions")
public class BbsUserPermissionsController
{
    @Autowired
    private IBbsUserPermissionsService bbsUserPermissionsService;

    /**
     * 查询帖子用户权限配置列表
     */
    @GetMapping("/list")
    public AjaxResult list(BbsUserPermissions bbsUserPermissions)
    {
        List<BbsUserPermissions> list = bbsUserPermissionsService.selectBbsUserPermissionsList(bbsUserPermissions);
        return AjaxResult.success(list);
    }

    /**
     * 获取帖子用户权限配置详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(bbsUserPermissionsService.selectBbsUserPermissionsById(id));
    }

    /**
     * 新增帖子用户权限配置
     */
    @PostMapping
    public AjaxResult add(@RequestBody BbsUserPermissions bbsUserPermissions)
    {
        return AjaxResult.success(bbsUserPermissionsService.insertBbsUserPermissions(bbsUserPermissions));
    }

    /**
     * 修改帖子用户权限配置
     */
    @PutMapping
    public AjaxResult edit(@RequestBody BbsUserPermissions bbsUserPermissions)
    {
        return AjaxResult.success(bbsUserPermissionsService.updateBbsUserPermissions(bbsUserPermissions));
    }

    /**
     * 删除帖子用户权限配置
     */
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return AjaxResult.success(bbsUserPermissionsService.deleteBbsUserPermissionsByIds(ids));
    }
}
