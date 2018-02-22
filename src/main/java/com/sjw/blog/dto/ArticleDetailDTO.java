package com.sjw.blog.dto;

import java.util.List;

import com.sjw.blog.entity.Article;
import com.sjw.blog.entity.Category;
import com.sjw.blog.entity.Comment;
import com.sjw.blog.entity.CommentCustom;
import com.sjw.blog.entity.Tag;
import com.sjw.blog.entity.User;

/**
 * @author Jiawei Shi
 * @version 创建时间：2018年2月22日 下午2:44:31
 *
 */
public class ArticleDetailDTO {
	// 文章信息
	private Article article;

	// 文章的作者相关信息
	private User user;

	// 文章的分类相关信息
	private List<Category> categoryList;

	// 文章的标签相关信息
	private List<Tag> tagList;

	// 文章评论信息
	private List<CommentCustom> commentCustomList;

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Category> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(List<Category> categoryList) {
		this.categoryList = categoryList;
	}

	public List<Tag> getTagList() {
		return tagList;
	}

	public void setTagList(List<Tag> tagList) {
		this.tagList = tagList;
	}

	public List<CommentCustom> getCommentCustomList() {
		return commentCustomList;
	}

	public void setCommentCustomList(List<CommentCustom> commentCustomList) {
		this.commentCustomList = commentCustomList;
	}

}
