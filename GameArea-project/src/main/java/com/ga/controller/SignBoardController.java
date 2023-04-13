package com.ga.controller;

import java.util.List;

import com.ga.domain.msg.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ga.domain.SignBoard;
import com.ga.service.ISignBoardService;

/**
 * 公告版信息Controller
 * 
 * @author wws
 */
@RestController
@RequestMapping("/ga/signBoard")
public class SignBoardController
{
    @Autowired
    private ISignBoardService signBoardService;

    /**
     * 查询公告版信息列表
     */
    @GetMapping("/list")
    public AjaxResult list(SignBoard signBoard)
    {
        List<SignBoard> list = signBoardService.selectSignBoardList(signBoard);
        return AjaxResult.success(list);
    }

    /**
     * 获取公告版信息详细信息
     */
    @GetMapping(value = "/{boardId}")
    public AjaxResult getInfo(@PathVariable("boardId") Long boardId)
    {
        return AjaxResult.success(signBoardService.selectSignBoardByBoardId(boardId));
    }

    /**
     * 新增公告版信息
     */
    @PostMapping
    public AjaxResult add(@RequestBody SignBoard signBoard)
    {
        return AjaxResult.success(signBoardService.insertSignBoard(signBoard));
    }

    /**
     * 修改公告版信息
     */
    @PutMapping
    public AjaxResult edit(@RequestBody SignBoard signBoard)
    {
        return AjaxResult.success(signBoardService.updateSignBoard(signBoard));
    }

    /**
     * 删除公告版信息
     */
	@DeleteMapping("/{boardIds}")
    public AjaxResult remove(@PathVariable Long[] boardIds)
    {
        return AjaxResult.success(signBoardService.deleteSignBoardByBoardIds(boardIds));
    }
}
