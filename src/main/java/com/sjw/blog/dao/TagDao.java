package com.sjw.blog.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sjw.blog.entity.Tag;

/**
 * @author Jiawei Shi
 * @version 创建时间：2018年1月29日 下午4:16:21
 *
 */
public interface TagDao {

	List<Tag> getTag(@Param(value = "status") Integer status) throws Exception;

}
