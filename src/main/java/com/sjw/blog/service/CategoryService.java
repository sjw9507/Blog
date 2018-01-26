package com.sjw.blog.service;

import java.util.List;

import com.sjw.blog.entity.Category;

/**
 * @author Jiawei Shi
 * @version 创建时间：2018年1月26日 下午2:58:25
 *
 */
public interface CategoryService {

	List<Category> getCategory(Integer status) throws Exception;

}
