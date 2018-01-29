package com.sjw.blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sjw.blog.dao.OptionsDao;
import com.sjw.blog.entity.Options;
import com.sjw.blog.service.OptionsService;

/**
* @author Jiawei Shi
* @version 创建时间：2018年1月26日 上午10:26:47
*
*/

@Service
public class OptionsServiceImpl implements OptionsService {

	@Autowired
	private OptionsDao optionsDao;
	
	@Override
	public Options getOptions() throws Exception {
		return optionsDao.getOptions();
	}
	
}
