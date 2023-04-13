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
import com.ga.domain.AreaUserInfo;
import com.ga.service.IAreaUserInfoService;

/**
 * 平台用户信息Controller
 * 
 * @author wws
 */
@RestController
@RequestMapping("/ga/areaUserInfo")
public class AreaUserInfoController
{
    @Autowired
    private IAreaUserInfoService areaUserInfoService;

    /**
     * 查询平台用户信息列表
     */
    @GetMapping("/list")
    public AjaxResult list(AreaUserInfo areaUserInfo)
    {
        List<AreaUserInfo> list = areaUserInfoService.selectAreaUserInfoList(areaUserInfo);
        return AjaxResult.success(list);
    }

    /**
     * 获取平台用户信息详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(areaUserInfoService.selectAreaUserInfoById(id));
    }

    /**
     * 新增平台用户信息
     */
    @PostMapping
    public AjaxResult add(@RequestBody AreaUserInfo areaUserInfo)
    {
        return AjaxResult.success(areaUserInfoService.insertAreaUserInfo(areaUserInfo));
    }

    /**
     * 修改平台用户信息
     */
    @PutMapping
    public AjaxResult edit(@RequestBody AreaUserInfo areaUserInfo)
    {
        return AjaxResult.success(areaUserInfoService.updateAreaUserInfo(areaUserInfo));
    }

    /**
     * 删除平台用户信息
     */
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return AjaxResult.success(areaUserInfoService.deleteAreaUserInfoByIds(ids));
    }
}
