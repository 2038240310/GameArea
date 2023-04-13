package com.ga.mapper;

import java.util.List;
import com.ga.domain.SignType;
import org.apache.ibatis.annotations.Mapper;

/**
 * 公告版类型管理Mapper接口
 * 
 * @author wws
 * @date 2023-04-13
 */
@Mapper
public interface SignTypeMapper 
{
    /**
     * 查询公告版类型管理
     * 
     * @param typeId 公告版类型管理主键
     * @return 公告版类型管理
     */
    public SignType selectSignTypeByTypeId(Long typeId);

    /**
     * 查询公告版类型管理列表
     * 
     * @param signType 公告版类型管理
     * @return 公告版类型管理集合
     */
    public List<SignType> selectSignTypeList(SignType signType);

    /**
     * 新增公告版类型管理
     * 
     * @param signType 公告版类型管理
     * @return 结果
     */
    public int insertSignType(SignType signType);

    /**
     * 修改公告版类型管理
     * 
     * @param signType 公告版类型管理
     * @return 结果
     */
    public int updateSignType(SignType signType);

    /**
     * 删除公告版类型管理
     * 
     * @param typeId 公告版类型管理主键
     * @return 结果
     */
    public int deleteSignTypeByTypeId(Long typeId);

    /**
     * 批量删除公告版类型管理
     * 
     * @param typeIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSignTypeByTypeIds(Long[] typeIds);
}
