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
import com.ga.domain.LibPath;
import com.ga.service.ILibPathService;

/**
 * 资料库资源路径Controller
 * 
 * @author wws
 */
@RestController
@RequestMapping("/ga/libPath")
public class LibPathController
{
    @Autowired
    private ILibPathService libPathService;

    /**
     * 查询资料库资源路径列表
     */
    @GetMapping("/list")
    public AjaxResult list(LibPath libPath)
    {
        List<LibPath> list = libPathService.selectLibPathList(libPath);
        return AjaxResult.success(list);
    }

    /**
     * 获取资料库资源路径详细信息
     */
    @GetMapping(value = "/{pathId}")
    public AjaxResult getInfo(@PathVariable("pathId") Long pathId)
    {
        return AjaxResult.success(libPathService.selectLibPathByPathId(pathId));
    }

    /**
     * 新增资料库资源路径
     */
    @PostMapping
    public AjaxResult add(@RequestBody LibPath libPath)
    {
        return AjaxResult.success(libPathService.insertLibPath(libPath));
    }

    /**
     * 修改资料库资源路径
     */
    @PutMapping
    public AjaxResult edit(@RequestBody LibPath libPath)
    {
        return AjaxResult.success(libPathService.updateLibPath(libPath));
    }

    /**
     * 删除资料库资源路径
     */
	@DeleteMapping("/{pathIds}")
    public AjaxResult remove(@PathVariable Long[] pathIds)
    {
        return AjaxResult.success(libPathService.deleteLibPathByPathIds(pathIds));
    }
}
