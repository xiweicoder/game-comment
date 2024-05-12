package com.lfs.service;

import com.lfs.dto.Result;
import com.lfs.entity.Blog;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 西尾coding
 * @since 2021-12-22
 */
public interface IBlogService extends IService<Blog> {

    /**
     *  查询当前页内容
     * @param current
     * @return
     */
    Result queryHotBlog(Integer current);

    /**
     *  根据id查询用户
     * @param id
     * @return
     */
    Result queryBlogById(Long id);

    /**
     *  点赞
     * @param id
     * @return
     */
    Result likeBlog(Long id);

    /**
     *  查询top5点赞用户
     * @param id
     * @return
     */
    Result queryBlogLikes(Long id);

    /**
     * 保存笔记
     * @param blog
     * @return
     */
    Result saveBlog(Blog blog);

    Result queryBlogOfFollow(Long max, Integer offset);

}
