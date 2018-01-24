package com.sjw.blog.dao.auto;

import com.sjw.blog.entity.Link;
import com.sjw.blog.entity.LinkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;


public interface LinkMapper {
    int countByExample(LinkExample example);

    int deleteByExample(LinkExample example);

    int deleteByPrimaryKey(Integer linkId);

    int insert(Link record);

    int insertSelective(Link record);

    List<Link> selectByExample(LinkExample example);

    Link selectByPrimaryKey(Integer linkId);

    int updateByExampleSelective(@Param("record") Link record, @Param("example") LinkExample example);

    int updateByExample(@Param("record") Link record, @Param("example") LinkExample example);

    int updateByPrimaryKeySelective(Link record);

    int updateByPrimaryKey(Link record);
}