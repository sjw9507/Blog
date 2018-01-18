package com.sjw.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @author Jiawei Shi
* @version 创建时间：2018年1月18日 下午3:00:25
*
*/

@Controller
public class IndexController {
	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
