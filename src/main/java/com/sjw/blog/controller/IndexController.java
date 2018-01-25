package com.sjw.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sjw.blog.entity.Menu;
import com.sjw.blog.entity.Notice;
import com.sjw.blog.service.MenuService;
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
	
    @Autowired
    private MenuService menuService;
    
	@ModelAttribute
	public void init(Model model) throws Exception{
		//公告
		List<Notice> noticeList = noticeService.getNotice(1);
		model.addAttribute("noticeList", noticeList);
		
		//顶部菜单
		List<Menu> menuList = menuService.getMenu(1);
		model.addAttribute("menuList", menuList);
	}
	
	@RequestMapping("/")
	public String index() throws Exception {
		return "front/index";
	}
}
