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
import com.ga.domain.AreaUser;
import com.ga.service.IAreaUserService;

/**
 * 平台用户Controller
 * 
 * @author wws
 */
@RestController
@RequestMapping("/ga/areaUser")
public class AreaUserController
{
    @Autowired
    private IAreaUserService areaUserService;

    /**
     * 查询平台用户列表
     */
    @GetMapping("/list")
    public AjaxResult list(AreaUser areaUser)
    {
        List<AreaUser> list = areaUserService.selectAreaUserList(areaUser);
        return AjaxResult.success(list);
    }

    /**
     * 获取平台用户详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(areaUserService.selectAreaUserById(id));
    }

    /**
     * 新增平台用户
     */
    @PostMapping
    public AjaxResult add(@RequestBody AreaUser areaUser)
    {
        return AjaxResult.success(areaUserService.insertAreaUser(areaUser));
    }

    /**
     * 修改平台用户
     */
    @PutMapping
    public AjaxResult edit(@RequestBody AreaUser areaUser)
    {
        return AjaxResult.success(areaUserService.updateAreaUser(areaUser));
    }

    /**
     * 删除平台用户
     */
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return AjaxResult.success(areaUserService.deleteAreaUserByIds(ids));
    }
}
