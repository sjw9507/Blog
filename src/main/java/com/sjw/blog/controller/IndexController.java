package com.sjw.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sjw.blog.entity.Notice;
import com.sjw.blog.service.NoticeService;

/**
* @author Jiawei Shi
* @version 创建时间：2018年1月23日 下午2:40:09
*
*/
public class IndexController {
	
	@Autowired
	private NoticeService noticeService;
	
	
	@ModelAttribute
	public void init(Model model) {
		//公告
//		List<Notice> noticeList = noticeService.
		
	}
	
	
	
	@RequestMapping("/")
	public String index() throws Exception {
		return "front/index";
	}
}
