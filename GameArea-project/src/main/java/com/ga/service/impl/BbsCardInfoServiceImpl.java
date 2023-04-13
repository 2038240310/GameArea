package com.ga.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ga.mapper.BbsCardInfoMapper;
import com.ga.domain.BbsCardInfo;
import com.ga.service.IBbsCardInfoService;

/**
 * 论坛帖子信息Service业务层处理
 * 
 * @author wws
 * @date 2023-04-13
 */
@Service
public class BbsCardInfoServiceImpl implements IBbsCardInfoService 
{
    @Autowired
    private BbsCardInfoMapper bbsCardInfoMapper;

    /**
     * 查询论坛帖子信息
     * 
     * @param infoId 论坛帖子信息主键
     * @return 论坛帖子信息
     */
    @Override
    public BbsCardInfo selectBbsCardInfoByInfoId(Long infoId)
    {
        return bbsCardInfoMapper.selectBbsCardInfoByInfoId(infoId);
    }

    /**
     * 查询论坛帖子信息列表
     * 
     * @param bbsCardInfo 论坛帖子信息
     * @return 论坛帖子信息
     */
    @Override
    public List<BbsCardInfo> selectBbsCardInfoList(BbsCardInfo bbsCardInfo)
    {
        return bbsCardInfoMapper.selectBbsCardInfoList(bbsCardInfo);
    }

    /**
     * 新增论坛帖子信息
     * 
     * @param bbsCardInfo 论坛帖子信息
     * @return 结果
     */
    @Override
    public int insertBbsCardInfo(BbsCardInfo bbsCardInfo)
    {
        return bbsCardInfoMapper.insertBbsCardInfo(bbsCardInfo);
    }

    /**
     * 修改论坛帖子信息
     * 
     * @param bbsCardInfo 论坛帖子信息
     * @return 结果
     */
    @Override
    public int updateBbsCardInfo(BbsCardInfo bbsCardInfo)
    {
        return bbsCardInfoMapper.updateBbsCardInfo(bbsCardInfo);
    }

    /**
     * 批量删除论坛帖子信息
     * 
     * @param infoIds 需要删除的论坛帖子信息主键
     * @return 结果
     */
    @Override
    public int deleteBbsCardInfoByInfoIds(Long[] infoIds)
    {
        return bbsCardInfoMapper.deleteBbsCardInfoByInfoIds(infoIds);
    }

    /**
     * 删除论坛帖子信息信息
     * 
     * @param infoId 论坛帖子信息主键
     * @return 结果
     */
    @Override
    public int deleteBbsCardInfoByInfoId(Long infoId)
    {
        return bbsCardInfoMapper.deleteBbsCardInfoByInfoId(infoId);
    }
}
