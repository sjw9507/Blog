package com.sjw.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sjw.blog.dto.ArticleDetailDTO;
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
	public String ArticleDetail(@PathVariable("articleId") Integer articleId,Model model) throws Exception {

		// 封装文章详细页面的所需内容(文章信息，分类，标签，作者，评论)
		ArticleDetailDTO articleDetail = articleService.getArticleDetailById(articleId);
		
		model.addAttribute("articleDetail", articleDetail);
		return "front/Page/articleDetail";
	}

}
