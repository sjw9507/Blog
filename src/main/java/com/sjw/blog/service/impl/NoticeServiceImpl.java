package com.sjw.blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sjw.blog.dao.NoticeDao;
import com.sjw.blog.entity.Notice;
import com.sjw.blog.service.NoticeService;

/**
* @author Jiawei Shi
* @version 创建时间：2018年1月24日 下午5:02:25
*
*/

@Service
public class NoticeServiceImpl implements NoticeService {

	@Autowired
	private NoticeDao noticeDao;
	
	@Override
	public List<Notice> getNotice(Integer status) throws Exception {
		return noticeDao.getNotice(status);
	}
	
}
