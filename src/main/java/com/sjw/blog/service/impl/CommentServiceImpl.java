package com.sjw.blog.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sjw.blog.dao.ArticleDao;
import com.sjw.blog.dao.CommentDao;
import com.sjw.blog.dto.CommentDTO;
import com.sjw.blog.entity.Article;
import com.sjw.blog.entity.CommentCustom;
import com.sjw.blog.service.CommentService;
import com.sjw.blog.util.Functions;

/**
* @author Jiawei Shi
* @version 创建时间：2018年2月28日 下午3:15:36
*
*/
@Service
public class CommentServiceImpl implements CommentService {
	@Autowired
	private CommentDao commentDao;

	@Autowired
	private ArticleDao articleDao;
	
	@Override
	public List<CommentDTO> listRecentComment(Integer limit) {
		List<CommentDTO> recentCommentList = new ArrayList<CommentDTO>();
		List<CommentCustom> commentCustomList = commentDao.listRecentComment(limit);
		for(int i=0;i<commentCustomList.size();i++) {
			CommentDTO commentDTO = new CommentDTO();
			//给每个评论用户添加头像
			String avatar = Functions.getGravatar(commentCustomList.get(i).getCommentAuthorEmail());
			CommentCustom commentCustom = commentCustomList.get(i);
			commentCustom.setCommentAuthorAvatar(avatar);
			commentDTO.setCommentCustom(commentCustom);
			//找到评论对应的文章信息
			Article article = articleDao.getArticleById(1,commentCustom.getCommentArticleId());
			commentDTO.setArticle(article);

			recentCommentList.add(commentDTO);
		}

		return recentCommentList;
	}
}
