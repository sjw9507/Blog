package com.sjw.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sjw.blog.dto.ArticleDTO;
import com.sjw.blog.entity.Category;
import com.sjw.blog.service.CategoryService;

/**
 * @author Jiawei Shi
 * @version 创建时间：2018年3月1日 下午4:20:19
 *
 */
@Controller
public class CategoryController {
	@Autowired
	private CategoryService categoryService;

	// 根据分类查询文章
	@RequestMapping("/category/{cateId}")
	public String ArticleListByCategoryView(@PathVariable("cateId") Integer cateId, Model model) throws Exception {
		// 设置每页显示条数
		int pageSize = 10;
		List<ArticleDTO> articleDTOList = categoryService.listArticleWithCategoryByPage(1, null, pageSize, cateId);

		// 如果articleDTOList=null表示该分类不存在，如果=0表示该分类暂时没有文章
		model.addAttribute("articleDTOList", articleDTOList);

		// 该分类信息
		Category category = categoryService.getCategoryById(1, cateId);
		model.addAttribute("category", category);

		return "front/Page/articleListByCategory";
	}

	// 根据分类查询文章分页
	@RequestMapping("/category/{cateId}/p/{pageNow}")
	public String ArticleListByCategoryAndPageView(@PathVariable("pageNow") Integer pageNow,
			@PathVariable("cateId") Integer cateId, Model model) throws Exception {
		// 设置每页显示条数
		int pageSize = 10;
		List<ArticleDTO> articleDTOList = categoryService.listArticleWithCategoryByPage(1, pageNow, pageSize, cateId);
		model.addAttribute("articleDTOList", articleDTOList);

		// 该分类信息
		Category category = categoryService.getCategoryById(1, cateId);
		model.addAttribute("category", category);
		return "front/Page/articleListByCategory";
	}
}
