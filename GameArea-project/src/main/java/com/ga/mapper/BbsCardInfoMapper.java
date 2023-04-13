package com.ga.mapper;

import java.util.List;
import com.ga.domain.BbsCardInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * 论坛帖子信息Mapper接口
 * 
 * @author wws
 * @date 2023-04-13
 */
@Mapper
public interface BbsCardInfoMapper 
{
    /**
     * 查询论坛帖子信息
     * 
     * @param infoId 论坛帖子信息主键
     * @return 论坛帖子信息
     */
    public BbsCardInfo selectBbsCardInfoByInfoId(Long infoId);

    /**
     * 查询论坛帖子信息列表
     * 
     * @param bbsCardInfo 论坛帖子信息
     * @return 论坛帖子信息集合
     */
    public List<BbsCardInfo> selectBbsCardInfoList(BbsCardInfo bbsCardInfo);

    /**
     * 新增论坛帖子信息
     * 
     * @param bbsCardInfo 论坛帖子信息
     * @return 结果
     */
    public int insertBbsCardInfo(BbsCardInfo bbsCardInfo);

    /**
     * 修改论坛帖子信息
     * 
     * @param bbsCardInfo 论坛帖子信息
     * @return 结果
     */
    public int updateBbsCardInfo(BbsCardInfo bbsCardInfo);

    /**
     * 删除论坛帖子信息
     * 
     * @param infoId 论坛帖子信息主键
     * @return 结果
     */
    public int deleteBbsCardInfoByInfoId(Long infoId);

    /**
     * 批量删除论坛帖子信息
     * 
     * @param infoIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBbsCardInfoByInfoIds(Long[] infoIds);
}
