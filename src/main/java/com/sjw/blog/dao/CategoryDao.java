package com.sjw.blog.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sjw.blog.entity.Category;

/**
 * @author Jiawei Shi
 * @version 创建时间：2018年1月26日 下午3:00:09
 *
 */
public interface CategoryDao {

	List<Category> getCategory(@Param(value = "status") Integer status) throws Exception;

	Category getCategoryById(@Param(value = "status") Integer status, @Param(value = "id") Integer id);

	Integer countCategory(@Param(value = "status")Integer status);

}
