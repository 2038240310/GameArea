package com.ga.service;

import java.util.List;
import com.ga.domain.LibPath;

/**
 * 资料库资源路径Service接口
 * 
 * @author wws
 * @date 2023-04-13
 */
public interface ILibPathService 
{
    /**
     * 查询资料库资源路径
     * 
     * @param pathId 资料库资源路径主键
     * @return 资料库资源路径
     */
    public LibPath selectLibPathByPathId(Long pathId);

    /**
     * 查询资料库资源路径列表
     * 
     * @param libPath 资料库资源路径
     * @return 资料库资源路径集合
     */
    public List<LibPath> selectLibPathList(LibPath libPath);

    /**
     * 新增资料库资源路径
     * 
     * @param libPath 资料库资源路径
     * @return 结果
     */
    public int insertLibPath(LibPath libPath);

    /**
     * 修改资料库资源路径
     * 
     * @param libPath 资料库资源路径
     * @return 结果
     */
    public int updateLibPath(LibPath libPath);

    /**
     * 批量删除资料库资源路径
     * 
     * @param pathIds 需要删除的资料库资源路径主键集合
     * @return 结果
     */
    public int deleteLibPathByPathIds(Long[] pathIds);

    /**
     * 删除资料库资源路径信息
     * 
     * @param pathId 资料库资源路径主键
     * @return 结果
     */
    public int deleteLibPathByPathId(Long pathId);
}
