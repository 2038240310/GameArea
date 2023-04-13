package com.ga.service.impl;

import java.util.List;

import com.ga.utils.DateTimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ga.mapper.SignBoardMapper;
import com.ga.domain.SignBoard;
import com.ga.service.ISignBoardService;

/**
 * 公告版信息Service业务层处理
 * 
 * @author wws
 * @date 2023-04-13
 */
@Service
public class SignBoardServiceImpl implements ISignBoardService 
{
    @Autowired
    private SignBoardMapper signBoardMapper;

    /**
     * 查询公告版信息
     * 
     * @param boardId 公告版信息主键
     * @return 公告版信息
     */
    @Override
    public SignBoard selectSignBoardByBoardId(Long boardId)
    {
        return signBoardMapper.selectSignBoardByBoardId(boardId);
    }

    /**
     * 查询公告版信息列表
     * 
     * @param signBoard 公告版信息
     * @return 公告版信息
     */
    @Override
    public List<SignBoard> selectSignBoardList(SignBoard signBoard)
    {
        return signBoardMapper.selectSignBoardList(signBoard);
    }

    /**
     * 新增公告版信息
     * 
     * @param signBoard 公告版信息
     * @return 结果
     */
    @Override
    public int insertSignBoard(SignBoard signBoard)
    {
        signBoard.setCreateTime(DateTimeUtils.now());
        return signBoardMapper.insertSignBoard(signBoard);
    }

    /**
     * 修改公告版信息
     * 
     * @param signBoard 公告版信息
     * @return 结果
     */
    @Override
    public int updateSignBoard(SignBoard signBoard)
    {
        signBoard.setUpdateTime(DateTimeUtils.now());
        return signBoardMapper.updateSignBoard(signBoard);
    }

    /**
     * 批量删除公告版信息
     * 
     * @param boardIds 需要删除的公告版信息主键
     * @return 结果
     */
    @Override
    public int deleteSignBoardByBoardIds(Long[] boardIds)
    {
        return signBoardMapper.deleteSignBoardByBoardIds(boardIds);
    }

    /**
     * 删除公告版信息信息
     * 
     * @param boardId 公告版信息主键
     * @return 结果
     */
    @Override
    public int deleteSignBoardByBoardId(Long boardId)
    {
        return signBoardMapper.deleteSignBoardByBoardId(boardId);
    }
}
