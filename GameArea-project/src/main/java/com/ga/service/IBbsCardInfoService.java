package com.ga.service;

import java.util.List;
import com.ga.domain.BbsCardInfo;

/**
 * 论坛帖子信息Service接口
 * 
 * @author wws
 * @date 2023-04-13
 */
public interface IBbsCardInfoService 
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
     * 批量删除论坛帖子信息
     * 
     * @param infoIds 需要删除的论坛帖子信息主键集合
     * @return 结果
     */
    public int deleteBbsCardInfoByInfoIds(Long[] infoIds);

    /**
     * 删除论坛帖子信息信息
     * 
     * @param infoId 论坛帖子信息主键
     * @return 结果
     */
    public int deleteBbsCardInfoByInfoId(Long infoId);
}
