package com.sjw.blog.dao;

import org.apache.ibatis.annotations.Param;

/**
 * @author Jiawei Shi
 * @version 创建时间：2018年3月1日 上午10:20:30
 *
 */
public interface LinkDao {

	Integer countLink(@Param(value = "status") Integer status);

}
