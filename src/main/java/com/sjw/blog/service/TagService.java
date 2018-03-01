package com.sjw.blog.service;

import java.util.List;

import com.sjw.blog.dto.TagDTO;

/**
 * @author Jiawei Shi
 * @version 创建时间：2018年1月29日 下午4:14:34
 *
 */
public interface TagService {

	List<TagDTO> getTag(Integer status) throws Exception;

	Integer countTag(Integer status);

}
