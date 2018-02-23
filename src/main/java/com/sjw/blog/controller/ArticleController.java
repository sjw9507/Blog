package com.sjw.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sjw.blog.dto.ArticleDetailDTO;
import com.sjw.blog.entity.Article;
import com.sjw.blog.service.ArticleService;

/**
 * @author Jiawei Shi
 * @version 创建时间：2018年2月22日 下午1:39:30
 *
 */

@Controller
public class ArticleController {
	@Autowired
	private ArticleService articleService;

	// 文章详情页面
	@RequestMapping(value = "/article/{articleId}")
	public String ArticleDetail(@PathVariable("articleId") Integer articleId, Model model) throws Exception {

		// 封装文章详细页面的所需内容(文章信息，分类，标签，作者，评论)
		ArticleDetailDTO articleDetail = articleService.getArticleDetailById(articleId);

		// 相关文章
		Integer parentCategoryId = articleService.getArticleById(1, articleId).getArticleParentCategoryId();
		Integer childCategoryId = articleService.getArticleById(1, articleId).getArticleChildCategoryId();
		List<Article> similarArticleList = articleService.listArticleWithSameCategory(1, parentCategoryId,
				childCategoryId, 5);
		model.addAttribute("similarArticleList", similarArticleList);

		// 猜你喜欢
		List<Article> mostViewArticleList = articleService.listArticleByViewCount(1, 5);
		model.addAttribute("mostViewArticleList", mostViewArticleList);
		//获取下一篇文章
		Article afterArticle = articleService.getAfterArticle(1, articleId);
		model.addAttribute("afterArticle", afterArticle);
		//获取上一篇文章
		Article preArticle = articleService.getPreArticle(1, articleId);
		model.addAttribute("preArticle", preArticle);
		
		
		model.addAttribute("articleDetail", articleDetail);
		return "front/Page/articleDetail";
	}

}
