package com.sjw.blog.dto;

import com.sjw.blog.entity.Article;
import com.sjw.blog.entity.CommentCustom;

/**
 * @author Jiawei Shi
 * @version 创建时间：2018年3月1日 上午10:43:09
 *
 */
public class CommentDTO {
	// 评论信息
	private CommentCustom commentCustom;

	// 文章信息
	private Article article;

	public CommentCustom getCommentCustom() {
		return commentCustom;
	}

	public void setCommentCustom(CommentCustom commentCustom) {
		this.commentCustom = commentCustom;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

}
