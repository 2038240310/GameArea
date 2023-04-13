package com.ga.service;

import java.util.List;
import com.ga.domain.AreaArea;

/**
 * 平台最高级分区Service接口
 * 
 * @author wws
 * @date 2023-04-13
 */
public interface IAreaAreaService 
{
    /**
     * 查询平台最高级分区
     * 
     * @param id 平台最高级分区主键
     * @return 平台最高级分区
     */
    public AreaArea selectAreaAreaById(Long id);

    /**
     * 查询平台最高级分区列表
     * 
     * @param areaArea 平台最高级分区
     * @return 平台最高级分区集合
     */
    public List<AreaArea> selectAreaAreaList(AreaArea areaArea);

    /**
     * 新增平台最高级分区
     * 
     * @param areaArea 平台最高级分区
     * @return 结果
     */
    public int insertAreaArea(AreaArea areaArea);

    /**
     * 修改平台最高级分区
     * 
     * @param areaArea 平台最高级分区
     * @return 结果
     */
    public int updateAreaArea(AreaArea areaArea);

    /**
     * 批量删除平台最高级分区
     * 
     * @param ids 需要删除的平台最高级分区主键集合
     * @return 结果
     */
    public int deleteAreaAreaByIds(Long[] ids);

    /**
     * 删除平台最高级分区信息
     * 
     * @param id 平台最高级分区主键
     * @return 结果
     */
    public int deleteAreaAreaById(Long id);
}
