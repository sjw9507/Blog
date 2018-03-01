package com.sjw.blog.service;

import java.util.List;

import com.sjw.blog.dto.ArticleDTO;
import com.sjw.blog.dto.ArticleDetailDTO;
import com.sjw.blog.entity.Article;

/**
 * @author Jiawei Shi
 * @version 创建时间：2018年1月30日 下午3:22:27
 *
 */
public interface ArticleService {
	// 分页显示
	public List<ArticleDTO> getArticleByPage(Integer status, Integer pageNow, Integer pageSize) throws Exception;

	public ArticleDetailDTO getArticleDetailById(Integer articleId) throws Exception;

	public Article getArticleById(Integer status, Integer articleId);

	public List<Article> listArticleWithSameCategory(Integer status, Integer parentCategoryId, Integer childCategoryId, Integer limit);

	public List<Article> listArticleByViewCount(Integer status, Integer limit);

	public Article getAfterArticle(Integer status, Integer articleId);

	public Article getPreArticle(Integer status, Integer articleId);

	//获得随机文章
	public List<Article> listRandomArticle(Integer status, Integer num);

	//获得热评文章
	public List<Article> listArticleByCommentCount(Integer status, int num);

	//获取文章总数
	public Integer countArticle(Integer status) throws Exception;

	public Integer countArticleComment(Integer status) throws Exception;

	public Integer countArticleView(Integer status);

	public Article getLastUpdateArticle();
	
}
