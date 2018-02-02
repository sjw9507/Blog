package com.sjw.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sjw.blog.dto.ArticleDTO;
import com.sjw.blog.dto.TagDTO;
import com.sjw.blog.entity.Category;
import com.sjw.blog.entity.Menu;
import com.sjw.blog.entity.Notice;
import com.sjw.blog.entity.Options;
import com.sjw.blog.service.ArticleService;
import com.sjw.blog.service.CategoryService;
import com.sjw.blog.service.MenuService;
import com.sjw.blog.service.NoticeService;
import com.sjw.blog.service.OptionsService;
import com.sjw.blog.service.TagService;

/**
 * @author Jiawei Shi
 * @version 创建时间：2018年1月23日 下午2:40:09
 *
 */

@Controller
public class IndexController {

	@Autowired
	private NoticeService noticeService;

	@Autowired
	private MenuService menuService;

	@Autowired
	private OptionsService optionsService;

	@Autowired
	private CategoryService categoryService;

	@Autowired
	private TagService tagService;

	@Autowired
	private ArticleService articleService;

	@ModelAttribute
	public void init(Model model) throws Exception {
		// 公告
		List<Notice> noticeList = noticeService.getNotice(1);
		model.addAttribute("noticeList", noticeList);

		// 顶部菜单
		List<Menu> menuList = menuService.getMenu(1);
		model.addAttribute("menuList", menuList);

		// 基本信息
		Options options = optionsService.getOptions();
		model.addAttribute("options", options);

		// 菜单目录
		List<Category> categoryList = categoryService.getCategory(1);
		model.addAttribute("categoryList", categoryList);

		// 所有标签栏
		List<TagDTO> tagList = tagService.getTag(1);
		model.addAttribute("tagList", tagList);

	}

	// 首页显示列表
	@RequestMapping("/")
	public String index(Model model) throws Exception {
		int pageSize = 10;
		List<ArticleDTO> articleDTOList = articleService.getArticleByPage(1, 1, pageSize);
		model.addAttribute("articleDTOList", articleDTOList);

		return "front/index";

	}

	// 首页文章分页
	@RequestMapping("/p/{pageNow}")
	public String ArticleListByPageView(@PathVariable("pageNow") Integer pageNow, Model model) throws Exception {
		// 设置每页显示的数量
		int pageSize = 10;
		List<ArticleDTO> articleDTOList = articleService.getArticleByPage(1, pageNow, pageSize);
		model.addAttribute("articleDTOList", articleDTOList);
		return "front/index";
	}

}
