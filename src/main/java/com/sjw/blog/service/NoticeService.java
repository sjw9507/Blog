package com.sjw.blog.service;

import java.util.List;

import com.sjw.blog.entity.Notice;

/**
* @author Jiawei Shi
* @version 创建时间：2018年1月24日 下午5:01:59
*
*/
public interface NoticeService {

	//公告
	List<Notice> getNotice(Integer status) throws Exception;
	
}
