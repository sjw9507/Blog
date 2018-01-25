package com.sjw.blog.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.sjw.blog.entity.Notice;

/**
* @author Jiawei Shi
* @version 创建时间：2018年1月25日 上午10:02:35
*
*/

public interface NoticeDao {

	//获取公告列表
	List<Notice> getNotice(@Param(value="status")Integer status) throws Exception;
	
}
