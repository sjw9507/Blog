package com.sjw.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

@Controller
public class IndexController {
	
	@Autowired
	private NoticeService noticeService;
	
	
	@ModelAttribute
	public void init(Model model){
		//公告
		List<Notice> noticeList = null;
		try {
			noticeList = noticeService.getNotice(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		model.addAttribute("noticeList", noticeList);
		
	}
	
	@RequestMapping("/")
	public String index() throws Exception {
		return "front/index";
	}
}
