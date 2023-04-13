package com.ga.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ga.mapper.ShareCardInfoMapper;
import com.ga.domain.ShareCardInfo;
import com.ga.service.IShareCardInfoService;

/**
 * 资源站帖子信息Service业务层处理
 * 
 * @author wws
 * @date 2023-04-13
 */
@Service
public class ShareCardInfoServiceImpl implements IShareCardInfoService 
{
    @Autowired
    private ShareCardInfoMapper shareCardInfoMapper;

    /**
     * 查询资源站帖子信息
     * 
     * @param infoId 资源站帖子信息主键
     * @return 资源站帖子信息
     */
    @Override
    public ShareCardInfo selectShareCardInfoByInfoId(Long infoId)
    {
        return shareCardInfoMapper.selectShareCardInfoByInfoId(infoId);
    }

    /**
     * 查询资源站帖子信息列表
     * 
     * @param shareCardInfo 资源站帖子信息
     * @return 资源站帖子信息
     */
    @Override
    public List<ShareCardInfo> selectShareCardInfoList(ShareCardInfo shareCardInfo)
    {
        return shareCardInfoMapper.selectShareCardInfoList(shareCardInfo);
    }

    /**
     * 新增资源站帖子信息
     * 
     * @param shareCardInfo 资源站帖子信息
     * @return 结果
     */
    @Override
    public int insertShareCardInfo(ShareCardInfo shareCardInfo)
    {
        return shareCardInfoMapper.insertShareCardInfo(shareCardInfo);
    }

    /**
     * 修改资源站帖子信息
     * 
     * @param shareCardInfo 资源站帖子信息
     * @return 结果
     */
    @Override
    public int updateShareCardInfo(ShareCardInfo shareCardInfo)
    {
        return shareCardInfoMapper.updateShareCardInfo(shareCardInfo);
    }

    /**
     * 批量删除资源站帖子信息
     * 
     * @param infoIds 需要删除的资源站帖子信息主键
     * @return 结果
     */
    @Override
    public int deleteShareCardInfoByInfoIds(Long[] infoIds)
    {
        return shareCardInfoMapper.deleteShareCardInfoByInfoIds(infoIds);
    }

    /**
     * 删除资源站帖子信息信息
     * 
     * @param infoId 资源站帖子信息主键
     * @return 结果
     */
    @Override
    public int deleteShareCardInfoByInfoId(Long infoId)
    {
        return shareCardInfoMapper.deleteShareCardInfoByInfoId(infoId);
    }
}
