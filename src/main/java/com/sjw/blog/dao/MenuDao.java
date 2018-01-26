package com.sjw.blog.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sjw.blog.entity.Menu;

/**
 * @author Jiawei Shi
 * @version 创建时间：2018年1月25日 下午4:18:39
 *
 */
public interface MenuDao {

	List<Menu> getMenu(@Param(value = "status") Integer status) throws Exception;

}
