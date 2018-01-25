package com.sjw.blog.service;

import java.util.List;

import com.sjw.blog.entity.Menu;

/**
 * @author Jiawei Shi
 * @version 创建时间：2018年1月25日 下午4:07:00
 *
 */
public interface MenuService {

	List<Menu> getMenu(Integer status) throws Exception;

}
