package com.sjw.blog.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sjw.blog.dto.ArticleDTO;
import com.sjw.blog.entity.Article;
import com.sjw.blog.entity.Category;

/**
 * @author Jiawei Shi
 * @version 创建时间：2018年1月26日 下午3:00:09
 *
 */
public interface CategoryDao {

	List<Category> getCategory(@Param(value = "status") Integer status) throws Exception;

	Category getCategoryById(@Param(value = "status") Integer status, @Param(value = "id") Integer id);

	Integer countCategory(@Param(value = "status") Integer status);

	// 获得含有该分类的文章列表
	public List<Article> listArticleWithCategoryByPage(@Param(value = "status") Integer status,
			@Param(value = "cateId") Integer cateId, @Param(value = "startPos") Integer startPos,
			@Param(value = "pageSize") Integer pageSize);

	Category selectByPrimaryKey(@Param(value = "cateId")Integer cateId);
}
