package com.sjw.blog.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sjw.blog.dao.ArticleDao;
import com.sjw.blog.dao.TagDao;
import com.sjw.blog.dto.TagDTO;
import com.sjw.blog.entity.Tag;
import com.sjw.blog.service.TagService;

/**
 * @author Jiawei Shi
 * @version 创建时间：2018年1月29日 下午4:15:21
 *
 */
@Service
public class TagServiceImpl implements TagService {
	@Autowired
	private TagDao tagDao;
	
	@Autowired
	private ArticleDao ariticleDao;

	@Override
	public List<TagDTO> getTag(Integer status) throws Exception {
		List<Tag> tagList = tagDao.getTag(status);
		List<TagDTO> tagDTOList = new ArrayList<>();
		for (Tag tag : tagList) {
			TagDTO tagDTO = Tag.transformToDTO(tag);
			tagDTO.setArticleCount(ariticleDao.countArticleByTag(status,tagDTO.getTagId()));
			tagDTOList.add(tagDTO);
		}
		return tagDTOList;
	}

	@Override
	public Integer countTag(Integer status) {
		return tagDao.countTag(status);
	}
	
	
}
