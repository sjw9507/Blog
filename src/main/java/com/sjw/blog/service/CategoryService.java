package com.sjw.blog.service;

import java.util.List;

import com.sjw.blog.dto.ArticleDTO;
import com.sjw.blog.entity.Category;

/**
 * @author Jiawei Shi
 * @version 创建时间：2018年1月26日 下午2:58:25
 *
 */
public interface CategoryService {

	List<Category> getCategory(Integer status) throws Exception;

	Integer countCategory(Integer status);

	//获得带有该分类的文章列表
	public List<ArticleDTO> listArticleWithCategoryByPage(Integer status,Integer pageNow,Integer pageSize,Integer cateId) throws Exception;

	Category getCategoryById(Integer status, Integer cateId);

}
