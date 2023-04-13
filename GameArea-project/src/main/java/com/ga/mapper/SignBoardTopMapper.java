package com.ga.mapper;

import java.util.List;
import com.ga.domain.SignBoardTop;
import org.apache.ibatis.annotations.Mapper;

/**
 * 头条公告信息（主页告示牌图片展示）Mapper接口
 * 
 * @author wws
 * @date 2023-04-13
 */
@Mapper
public interface SignBoardTopMapper 
{
    /**
     * 查询头条公告信息（主页告示牌图片展示）
     * 
     * @param topIp 头条公告信息（主页告示牌图片展示）主键
     * @return 头条公告信息（主页告示牌图片展示）
     */
    public SignBoardTop selectSignBoardTopByTopIp(Long topIp);

    /**
     * 查询头条公告信息（主页告示牌图片展示）列表
     * 
     * @param signBoardTop 头条公告信息（主页告示牌图片展示）
     * @return 头条公告信息（主页告示牌图片展示）集合
     */
    public List<SignBoardTop> selectSignBoardTopList(SignBoardTop signBoardTop);

    /**
     * 新增头条公告信息（主页告示牌图片展示）
     * 
     * @param signBoardTop 头条公告信息（主页告示牌图片展示）
     * @return 结果
     */
    public int insertSignBoardTop(SignBoardTop signBoardTop);

    /**
     * 修改头条公告信息（主页告示牌图片展示）
     * 
     * @param signBoardTop 头条公告信息（主页告示牌图片展示）
     * @return 结果
     */
    public int updateSignBoardTop(SignBoardTop signBoardTop);

    /**
     * 删除头条公告信息（主页告示牌图片展示）
     * 
     * @param topIp 头条公告信息（主页告示牌图片展示）主键
     * @return 结果
     */
    public int deleteSignBoardTopByTopIp(Long topIp);

    /**
     * 批量删除头条公告信息（主页告示牌图片展示）
     * 
     * @param topIps 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSignBoardTopByTopIps(Long[] topIps);
}
