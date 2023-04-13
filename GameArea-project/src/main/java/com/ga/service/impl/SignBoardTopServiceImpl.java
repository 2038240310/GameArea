package com.ga.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ga.mapper.SignBoardTopMapper;
import com.ga.domain.SignBoardTop;
import com.ga.service.ISignBoardTopService;

/**
 * 头条公告信息（主页告示牌图片展示）Service业务层处理
 * 
 * @author wws
 * @date 2023-04-13
 */
@Service
public class SignBoardTopServiceImpl implements ISignBoardTopService 
{
    @Autowired
    private SignBoardTopMapper signBoardTopMapper;

    /**
     * 查询头条公告信息（主页告示牌图片展示）
     * 
     * @param topIp 头条公告信息（主页告示牌图片展示）主键
     * @return 头条公告信息（主页告示牌图片展示）
     */
    @Override
    public SignBoardTop selectSignBoardTopByTopIp(Long topIp)
    {
        return signBoardTopMapper.selectSignBoardTopByTopIp(topIp);
    }

    /**
     * 查询头条公告信息（主页告示牌图片展示）列表
     * 
     * @param signBoardTop 头条公告信息（主页告示牌图片展示）
     * @return 头条公告信息（主页告示牌图片展示）
     */
    @Override
    public List<SignBoardTop> selectSignBoardTopList(SignBoardTop signBoardTop)
    {
        return signBoardTopMapper.selectSignBoardTopList(signBoardTop);
    }

    /**
     * 新增头条公告信息（主页告示牌图片展示）
     * 
     * @param signBoardTop 头条公告信息（主页告示牌图片展示）
     * @return 结果
     */
    @Override
    public int insertSignBoardTop(SignBoardTop signBoardTop)
    {
        return signBoardTopMapper.insertSignBoardTop(signBoardTop);
    }

    /**
     * 修改头条公告信息（主页告示牌图片展示）
     * 
     * @param signBoardTop 头条公告信息（主页告示牌图片展示）
     * @return 结果
     */
    @Override
    public int updateSignBoardTop(SignBoardTop signBoardTop)
    {
        return signBoardTopMapper.updateSignBoardTop(signBoardTop);
    }

    /**
     * 批量删除头条公告信息（主页告示牌图片展示）
     * 
     * @param topIps 需要删除的头条公告信息（主页告示牌图片展示）主键
     * @return 结果
     */
    @Override
    public int deleteSignBoardTopByTopIps(Long[] topIps)
    {
        return signBoardTopMapper.deleteSignBoardTopByTopIps(topIps);
    }

    /**
     * 删除头条公告信息（主页告示牌图片展示）信息
     * 
     * @param topIp 头条公告信息（主页告示牌图片展示）主键
     * @return 结果
     */
    @Override
    public int deleteSignBoardTopByTopIp(Long topIp)
    {
        return signBoardTopMapper.deleteSignBoardTopByTopIp(topIp);
    }
}
