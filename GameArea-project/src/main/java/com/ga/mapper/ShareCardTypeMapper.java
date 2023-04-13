package com.ga.mapper;

import java.util.List;
import com.ga.domain.ShareCardType;
import org.apache.ibatis.annotations.Mapper;

/**
 * 分享站帖子类型Mapper接口
 * 
 * @author wws
 * @date 2023-04-13
 */
@Mapper
public interface ShareCardTypeMapper 
{
    /**
     * 查询分享站帖子类型
     * 
     * @param typeId 分享站帖子类型主键
     * @return 分享站帖子类型
     */
    public ShareCardType selectShareCardTypeByTypeId(Long typeId);

    /**
     * 查询分享站帖子类型列表
     * 
     * @param shareCardType 分享站帖子类型
     * @return 分享站帖子类型集合
     */
    public List<ShareCardType> selectShareCardTypeList(ShareCardType shareCardType);

    /**
     * 新增分享站帖子类型
     * 
     * @param shareCardType 分享站帖子类型
     * @return 结果
     */
    public int insertShareCardType(ShareCardType shareCardType);

    /**
     * 修改分享站帖子类型
     * 
     * @param shareCardType 分享站帖子类型
     * @return 结果
     */
    public int updateShareCardType(ShareCardType shareCardType);

    /**
     * 删除分享站帖子类型
     * 
     * @param typeId 分享站帖子类型主键
     * @return 结果
     */
    public int deleteShareCardTypeByTypeId(Long typeId);

    /**
     * 批量删除分享站帖子类型
     * 
     * @param typeIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteShareCardTypeByTypeIds(Long[] typeIds);
}
