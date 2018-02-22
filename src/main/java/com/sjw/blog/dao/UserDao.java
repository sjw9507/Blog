package com.sjw.blog.dao;

import org.apache.ibatis.annotations.Param;

import com.sjw.blog.entity.User;

/**
 * @author Jiawei Shi
 * @version 创建时间：2018年2月22日 下午3:28:31
 *
 */
public interface UserDao {

	User selectByUserId(@Param(value = "userId") Integer userId);

}
