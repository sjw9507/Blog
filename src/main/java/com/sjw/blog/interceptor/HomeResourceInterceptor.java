package com.sjw.blog.interceptor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;

import com.sjw.blog.dto.CommentDTO;
import com.sjw.blog.dto.TagDTO;
import com.sjw.blog.entity.Article;
import com.sjw.blog.entity.Category;
import com.sjw.blog.entity.Menu;
import com.sjw.blog.entity.Options;
import com.sjw.blog.service.ArticleService;
import com.sjw.blog.service.CategoryService;
import com.sjw.blog.service.CommentService;
import com.sjw.blog.service.LinkService;
import com.sjw.blog.service.MenuService;
import com.sjw.blog.service.OptionsService;
import com.sjw.blog.service.TagService;

public class HomeResourceInterceptor implements WebRequestInterceptor {
	@Autowired
	private ArticleService articleService;

	@Autowired
	private CategoryService categoryService;

	@Autowired
	private TagService tagService;

	@Autowired
	private LinkService linkService;

	@Autowired
	private OptionsService optionsService;

	@Autowired
	private MenuService menuService;

	@Autowired
	private CommentService commentService;

	/**
	 * 在请求处理之前执行，该方法主要是用于准备资源数据的，然后可以把它们当做请求属性放到WebRequest中
	 */
	@Override
	public void preHandle(WebRequest request) throws Exception {
		// System.out.println("HomeResourceInterceptor...preHandle......");

		// 顶部菜单
		List<Menu> menuList = menuService.getMenu(1);
		request.setAttribute("menuList", menuList, WebRequest.SCOPE_REQUEST);

		// 基本信息
		Options options = optionsService.getOptions();
		request.setAttribute("options", options, WebRequest.SCOPE_REQUEST);

		// 菜单目录
		List<Category> categoryList = categoryService.getCategory(1);
		request.setAttribute("categoryList", categoryList, WebRequest.SCOPE_REQUEST);

		// 侧边栏显示
		// 所有标签栏
		List<TagDTO> tagList = tagService.getTag(1);
		request.setAttribute("tagList", tagList, WebRequest.SCOPE_REQUEST);

		// 获得随机文章
		List<Article> randomArticleList = articleService.listRandomArticle(1, 8);
		request.setAttribute("randomArticleList", randomArticleList, WebRequest.SCOPE_REQUEST);

		// 获得热评文章
		List<Article> mostCommentArticleList = articleService.listArticleByCommentCount(1, 8);
		request.setAttribute("mostCommentArticleList", mostCommentArticleList, WebRequest.SCOPE_REQUEST);

		// 最新评论
		List<CommentDTO> recentCommentList = commentService.listRecentComment(10);
		request.setAttribute("recentCommentList", recentCommentList, WebRequest.SCOPE_REQUEST);

		// 获得网站概况
		List<String> siteBasicStatistics = new ArrayList<String>();
		siteBasicStatistics.add(articleService.countArticle(1) + "");
		siteBasicStatistics.add(articleService.countArticleComment(1) + "");
		siteBasicStatistics.add(categoryService.countCategory(1) + "");
		siteBasicStatistics.add(tagService.countTag(1) + "");
		siteBasicStatistics.add(linkService.countLink(1) + "");
		siteBasicStatistics.add(articleService.countArticleView(1) + "");
		request.setAttribute("siteBasicStatistics", siteBasicStatistics, WebRequest.SCOPE_REQUEST);
		// 最后更新的文章
		Article lastUpdateArticle = articleService.getLastUpdateArticle();
		request.setAttribute("lastUpdateArticle", lastUpdateArticle, WebRequest.SCOPE_REQUEST);

	}

	/**
	 * 该方法将在Controller执行之后，返回视图之前执行，ModelMap表示请求Controller处理之后返回的Model对象，所以可以在
	 * 这个方法中修改ModelMap的属性，从而达到改变返回的模型的效果。
	 */
	@Override
	public void postHandle(WebRequest request, ModelMap map) throws Exception {
		// System.out.println("postHandle.......");
	}

	/**
	 * 该方法将在整个请求完成之后，也就是说在视图渲染之后进行调用，主要用于进行一些资源的释放
	 */
	@Override
	public void afterCompletion(WebRequest request, Exception exception) throws Exception {
		// System.out.println("afterCompletion");
	}
}