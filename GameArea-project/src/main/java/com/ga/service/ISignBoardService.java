package com.ga.service;

import java.util.List;
import com.ga.domain.SignBoard;

/**
 * 公告版信息Service接口
 * 
 * @author wws
 * @date 2023-04-13
 */
public interface ISignBoardService 
{
    /**
     * 查询公告版信息
     * 
     * @param boardId 公告版信息主键
     * @return 公告版信息
     */
    public SignBoard selectSignBoardByBoardId(Long boardId);

    /**
     * 查询公告版信息列表
     * 
     * @param signBoard 公告版信息
     * @return 公告版信息集合
     */
    public List<SignBoard> selectSignBoardList(SignBoard signBoard);

    /**
     * 新增公告版信息
     * 
     * @param signBoard 公告版信息
     * @return 结果
     */
    public int insertSignBoard(SignBoard signBoard);

    /**
     * 修改公告版信息
     * 
     * @param signBoard 公告版信息
     * @return 结果
     */
    public int updateSignBoard(SignBoard signBoard);

    /**
     * 批量删除公告版信息
     * 
     * @param boardIds 需要删除的公告版信息主键集合
     * @return 结果
     */
    public int deleteSignBoardByBoardIds(Long[] boardIds);

    /**
     * 删除公告版信息信息
     * 
     * @param boardId 公告版信息主键
     * @return 结果
     */
    public int deleteSignBoardByBoardId(Long boardId);
}
