package com.sjw.blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sjw.blog.dao.LinkDao;
import com.sjw.blog.service.LinkService;

/**
 * @author Jiawei Shi
 * @version 创建时间：2018年2月28日 下午3:14:08
 *
 */
@Service
public class LinkServiceImpl implements LinkService {

	@Autowired
	private LinkDao linkDao;

	@Override
	public Integer countLink(Integer status) {
		return linkDao.countLink(status);
	}

}
