package com.sjw.blog.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sjw.blog.entity.Comment;
import com.sjw.blog.entity.CommentCustom;

/**
 * @author Jiawei Shi
 * @version 创建时间：2018年2月22日 下午3:50:35
 *
 */
public interface CommentDao {

	List<CommentCustom> getCommentByArticleId(@Param(value = "status") Integer status,
			@Param(value = "articleId") Integer articleId);

	List<CommentCustom> listRecentComment(@Param(value = "limit") Integer limit);

}
