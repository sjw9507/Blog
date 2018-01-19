package com.sjw.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @author Jiawei Shi
* @version ����ʱ�䣺2018��1��18�� ����3:00:25
*
*/

@Controller
public class IndexController {
	@RequestMapping("/")
	public String index() {
		return "front/index";
	}
}
