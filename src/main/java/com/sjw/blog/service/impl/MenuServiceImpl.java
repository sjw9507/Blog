package com.sjw.blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sjw.blog.dao.MenuDao;
import com.sjw.blog.entity.Menu;
import com.sjw.blog.service.MenuService;

/**
* @author Jiawei Shi
* @version 创建时间：2018年1月25日 下午4:07:40
*
*/

@Service
public class MenuServiceImpl implements MenuService {

	@Autowired
	private MenuDao menuDao;
	
	@Override
	public List<Menu> getMenu(Integer status) throws Exception {
		List<Menu> menuList = menuDao.getMenu(status);
		return menuList;
	}
	
}
