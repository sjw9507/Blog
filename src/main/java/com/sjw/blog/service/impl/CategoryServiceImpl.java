package com.sjw.blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sjw.blog.dao.CategoryDao;
import com.sjw.blog.entity.Category;
import com.sjw.blog.service.CategoryService;

/**
* @author Jiawei Shi
* @version 创建时间：2018年1月26日 下午2:58:46
*
*/

@Service
public class CategoryServiceImpl implements CategoryService{
	@Autowired
	private CategoryDao categoryDao;

	@Override
	public List<Category> getCategory(Integer status) throws Exception {
		List<Category> categoryList = categoryDao.getCategory(status);
		return categoryList;
	}
}
