package com.sjw.blog.dto;

import java.util.List;

import com.sjw.blog.entity.Article;
import com.sjw.blog.entity.Category;
import com.sjw.blog.entity.Tag;
import com.sjw.blog.entity.User;
import com.sjw.blog.util.Page;

/**
 * @author Jiawei Shi
 * @version 创建时间：2018年1月31日 上午10:14:38
 *
 */
public class ArticleDTO {
	// 文章信息
	private Article article;

	// 文章所属分类
	private List<Category> categoryList;

	// 对应的标签
	private List<TagDTO> tagDTOList;

	// 分页
	private Page page;

	// 文章作者信息
	private User user;

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public List<Category> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(List<Category> categoryList) {
		this.categoryList = categoryList;
	}

	public List<TagDTO> getTagDTOList() {
		return tagDTOList;
	}

	public void setTagDTOList(List<TagDTO> tagDTOList) {
		this.tagDTOList = tagDTOList;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
