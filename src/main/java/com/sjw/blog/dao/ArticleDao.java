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

	Integer countArticle(@Param(value = "status") Integer status);
	
	Integer countArticleComment(@Param(value = "status")Integer status);

	List<Article> getArticleByPage(@Param(value = "status") Integer status, @Param(value = "startPos") int startPos,
			@Param(value = "pageSize") int pageSize);

	Integer countArticleByTag(@Param(value = "status") Integer status, @Param(value = "tagId") Integer tagId);

	Article getArticleById(@Param(value = "status") Integer status, @Param(value = "articleId")Integer articleId);

	List<Article> listArticleWithSameCategory(@Param(value = "status")Integer status, @Param(value = "parentCategoryId")Integer parentCategoryId,
			@Param(value = "childCategoryId")Integer childCategoryId,@Param(value = "limit")Integer limit);

	List<Article> listArticleByViewCount(@Param(value = "status")Integer status, @Param(value = "limit")Integer limit);

	Article getAfterArticle(@Param(value = "status")Integer status, @Param(value = "articleId")Integer articleId);

	Article getPreArticle(@Param(value = "status")Integer status, @Param(value = "articleId")Integer articleId);

	List<Article> listRandomArticle(@Param(value = "status")Integer status, @Param(value = "num")Integer num);

	List<Article> listArticleByCommentCount(@Param(value = "status")Integer status, @Param(value = "num")int num);

	Integer countArticleView(@Param(value = "status")Integer status);

	Article getLastUpdateArticle();

	int countArticleByCategory(@Param(value = "status")Integer status, @Param(value = "cateId")Integer cateId);

}
