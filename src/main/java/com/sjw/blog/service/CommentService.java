package com.sjw.blog.service;

import java.util.List;

import com.sjw.blog.dto.CommentDTO;


/**
* @author Jiawei Shi
* @version 创建时间：2018年2月28日 下午3:15:04
*
*/
public interface CommentService {

	List<CommentDTO> listRecentComment(Integer limit);


}
