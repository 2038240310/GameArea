package com.ga.service.impl;

import java.util.List;

import com.ga.utils.DateTimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ga.mapper.AreaAreaMapper;
import com.ga.domain.AreaArea;
import com.ga.service.IAreaAreaService;

/**
 * 平台最高级分区Service业务层处理
 * 
 * @author wws
 * @date 2023-04-13
 */
@Service
public class AreaAreaServiceImpl implements IAreaAreaService 
{
    @Autowired
    private AreaAreaMapper areaAreaMapper;

    /**
     * 查询平台最高级分区
     * 
     * @param id 平台最高级分区主键
     * @return 平台最高级分区
     */
    @Override
    public AreaArea selectAreaAreaById(Long id)
    {
        return areaAreaMapper.selectAreaAreaById(id);
    }

    /**
     * 查询平台最高级分区列表
     * 
     * @param areaArea 平台最高级分区
     * @return 平台最高级分区
     */
    @Override
    public List<AreaArea> selectAreaAreaList(AreaArea areaArea)
    {
        return areaAreaMapper.selectAreaAreaList(areaArea);
    }

    /**
     * 新增平台最高级分区
     * 
     * @param areaArea 平台最高级分区
     * @return 结果
     */
    @Override
    public int insertAreaArea(AreaArea areaArea)
    {
        areaArea.setCreateTime(DateTimeUtils.now());
        return areaAreaMapper.insertAreaArea(areaArea);
    }

    /**
     * 修改平台最高级分区
     * 
     * @param areaArea 平台最高级分区
     * @return 结果
     */
    @Override
    public int updateAreaArea(AreaArea areaArea)
    {
        return areaAreaMapper.updateAreaArea(areaArea);
    }

    /**
     * 批量删除平台最高级分区
     * 
     * @param ids 需要删除的平台最高级分区主键
     * @return 结果
     */
    @Override
    public int deleteAreaAreaByIds(Long[] ids)
    {
        return areaAreaMapper.deleteAreaAreaByIds(ids);
    }

    /**
     * 删除平台最高级分区信息
     * 
     * @param id 平台最高级分区主键
     * @return 结果
     */
    @Override
    public int deleteAreaAreaById(Long id)
    {
        return areaAreaMapper.deleteAreaAreaById(id);
    }
}
