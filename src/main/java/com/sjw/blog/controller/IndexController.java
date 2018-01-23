package com.sjw.blog.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


/**
* @author Jiawei Shi
* @version 创建时间：2018年1月23日 下午2:40:09
*
*/
public class IndexController {
	
	@ModelAttribute
	public void init(Model model) {
		
	}
	
	
	
	@RequestMapping("/")
	public String index() throws Exception {
		return "front/index";
	}
}
