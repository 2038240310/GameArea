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
import com.ga.domain.AreaArea;
import com.ga.service.IAreaAreaService;

/**
 * 平台最高级分区Controller
 * 
 * @author wws
 * @date 2023-04-13
 */
@RestController
@RequestMapping("/ga/areaArea")
public class AreaAreaController
{
    @Autowired
    private IAreaAreaService areaAreaService;

    /**
     * 查询平台最高级分区列表
     */
    @GetMapping("/list")
    public AjaxResult list(AreaArea areaArea)
    {
        List<AreaArea> list = areaAreaService.selectAreaAreaList(areaArea);
        return AjaxResult.success(list);
    }

    /**
     * 获取平台最高级分区详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(areaAreaService.selectAreaAreaById(id));
    }

    /**
     * 新增平台最高级分区
     */
    @PostMapping
    public AjaxResult add(@RequestBody AreaArea areaArea)
    {
        return AjaxResult.success(areaAreaService.insertAreaArea(areaArea));
    }

    /**
     * 修改平台最高级分区
     */
    @PutMapping
    public AjaxResult edit(@RequestBody AreaArea areaArea)
    {
        return AjaxResult.success(areaAreaService.updateAreaArea(areaArea));
    }

    /**
     * 删除平台最高级分区
     */
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return AjaxResult.success(areaAreaService.deleteAreaAreaByIds(ids));
    }
}
