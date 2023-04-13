package com.ga.service.impl;

import java.util.List;

import com.ga.utils.DateTimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ga.mapper.LibPathMapper;
import com.ga.domain.LibPath;
import com.ga.service.ILibPathService;

/**
 * 资料库资源路径Service业务层处理
 * 
 * @author wws
 * @date 2023-04-13
 */
@Service
public class LibPathServiceImpl implements ILibPathService 
{
    @Autowired
    private LibPathMapper libPathMapper;

    /**
     * 查询资料库资源路径
     * 
     * @param pathId 资料库资源路径主键
     * @return 资料库资源路径
     */
    @Override
    public LibPath selectLibPathByPathId(Long pathId)
    {
        return libPathMapper.selectLibPathByPathId(pathId);
    }

    /**
     * 查询资料库资源路径列表
     * 
     * @param libPath 资料库资源路径
     * @return 资料库资源路径
     */
    @Override
    public List<LibPath> selectLibPathList(LibPath libPath)
    {
        return libPathMapper.selectLibPathList(libPath);
    }

    /**
     * 新增资料库资源路径
     * 
     * @param libPath 资料库资源路径
     * @return 结果
     */
    @Override
    public int insertLibPath(LibPath libPath)
    {
        return libPathMapper.insertLibPath(libPath);
    }

    /**
     * 修改资料库资源路径
     * 
     * @param libPath 资料库资源路径
     * @return 结果
     */
    @Override
    public int updateLibPath(LibPath libPath)
    {
        libPath.setUpdateTime(DateTimeUtils.now());
        return libPathMapper.updateLibPath(libPath);
    }

    /**
     * 批量删除资料库资源路径
     * 
     * @param pathIds 需要删除的资料库资源路径主键
     * @return 结果
     */
    @Override
    public int deleteLibPathByPathIds(Long[] pathIds)
    {
        return libPathMapper.deleteLibPathByPathIds(pathIds);
    }

    /**
     * 删除资料库资源路径信息
     * 
     * @param pathId 资料库资源路径主键
     * @return 结果
     */
    @Override
    public int deleteLibPathByPathId(Long pathId)
    {
        return libPathMapper.deleteLibPathByPathId(pathId);
    }
}
