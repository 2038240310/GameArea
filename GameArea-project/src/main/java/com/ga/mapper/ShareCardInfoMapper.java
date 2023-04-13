package com.ga.mapper;

import java.util.List;
import com.ga.domain.ShareCardInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * 资源站帖子信息Mapper接口
 * 
 * @author wws
 * @date 2023-04-13
 */
@Mapper
public interface ShareCardInfoMapper 
{
    /**
     * 查询资源站帖子信息
     * 
     * @param infoId 资源站帖子信息主键
     * @return 资源站帖子信息
     */
    public ShareCardInfo selectShareCardInfoByInfoId(Long infoId);

    /**
     * 查询资源站帖子信息列表
     * 
     * @param shareCardInfo 资源站帖子信息
     * @return 资源站帖子信息集合
     */
    public List<ShareCardInfo> selectShareCardInfoList(ShareCardInfo shareCardInfo);

    /**
     * 新增资源站帖子信息
     * 
     * @param shareCardInfo 资源站帖子信息
     * @return 结果
     */
    public int insertShareCardInfo(ShareCardInfo shareCardInfo);

    /**
     * 修改资源站帖子信息
     * 
     * @param shareCardInfo 资源站帖子信息
     * @return 结果
     */
    public int updateShareCardInfo(ShareCardInfo shareCardInfo);

    /**
     * 删除资源站帖子信息
     * 
     * @param infoId 资源站帖子信息主键
     * @return 结果
     */
    public int deleteShareCardInfoByInfoId(Long infoId);

    /**
     * 批量删除资源站帖子信息
     * 
     * @param infoIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteShareCardInfoByInfoIds(Long[] infoIds);
}
