package com.sjw.blog.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sjw.blog.entity.Article;

/**
 * @author Jiawei Shi
 * @version 创建时间：2018年1月24日 下午2:53:54
 *
 */
public interface ArticleDao {

	int countArticle(@Param(value = "status") Integer status) throws Exception;

	List<Article> getArticleByPage(@Param(value = "status") Integer status, @Param(value = "startPos") int startPos,
			@Param(value = "pageSize") int pageSize);

	Integer countArticleByTag(@Param(value = "status") Integer status, @Param(value = "tagId") Integer tagId);

}
