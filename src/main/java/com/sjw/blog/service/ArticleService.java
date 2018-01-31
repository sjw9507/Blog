package com.sjw.blog.service;

import java.util.List;

import com.sjw.blog.dto.ArticleDTO;

/**
 * @author Jiawei Shi
 * @version 创建时间：2018年1月30日 下午3:22:27
 *
 */
public interface ArticleService {
	// 分页显示
	public List<ArticleDTO> getArticleByPage(Integer status, Integer pageNow, Integer pageSize) throws Exception;
	
}
