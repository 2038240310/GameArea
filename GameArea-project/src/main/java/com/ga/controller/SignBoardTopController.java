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
import com.ga.domain.SignBoardTop;
import com.ga.service.ISignBoardTopService;

/**
 * 头条公告信息（主页告示牌图片展示）Controller
 * 
 * @author wws
 */
@RestController
@RequestMapping("/ga/signBoardTop")
public class SignBoardTopController
{
    @Autowired
    private ISignBoardTopService signBoardTopService;

    /**
     * 查询头条公告信息（主页告示牌图片展示）列表
     */
    @GetMapping("/list")
    public AjaxResult list(SignBoardTop signBoardTop)
    {
        List<SignBoardTop> list = signBoardTopService.selectSignBoardTopList(signBoardTop);
        return AjaxResult.success(list);
    }

    /**
     * 获取头条公告信息（主页告示牌图片展示）详细信息
     */
    @GetMapping(value = "/{topIp}")
    public AjaxResult getInfo(@PathVariable("topIp") Long topIp)
    {
        return AjaxResult.success(signBoardTopService.selectSignBoardTopByTopIp(topIp));
    }

    /**
     * 新增头条公告信息（主页告示牌图片展示）
     */
    @PostMapping
    public AjaxResult add(@RequestBody SignBoardTop signBoardTop)
    {
        return AjaxResult.success(signBoardTopService.insertSignBoardTop(signBoardTop));
    }

    /**
     * 修改头条公告信息（主页告示牌图片展示）
     */
    @PutMapping
    public AjaxResult edit(@RequestBody SignBoardTop signBoardTop)
    {
        return AjaxResult.success(signBoardTopService.updateSignBoardTop(signBoardTop));
    }

    /**
     * 删除头条公告信息（主页告示牌图片展示）
     */
	@DeleteMapping("/{topIps}")
    public AjaxResult remove(@PathVariable Long[] topIps)
    {
        return AjaxResult.success(signBoardTopService.deleteSignBoardTopByTopIps(topIps));
    }
}
