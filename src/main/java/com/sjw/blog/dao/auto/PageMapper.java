package com.sjw.blog.dao.auto;

import com.sjw.blog.entity.Page;
import com.sjw.blog.entity.PageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;


public interface PageMapper {
    int countByExample(PageExample example);

    int deleteByExample(PageExample example);

    int deleteByPrimaryKey(Integer pageId);

    int insert(Page record);

    int insertSelective(Page record);

    List<Page> selectByExampleWithBLOBs(PageExample example);

    List<Page> selectByExample(PageExample example);

    Page selectByPrimaryKey(Integer pageId);

    int updateByExampleSelective(@Param("record") Page record, @Param("example") PageExample example);

    int updateByExampleWithBLOBs(@Param("record") Page record, @Param("example") PageExample example);

    int updateByExample(@Param("record") Page record, @Param("example") PageExample example);

    int updateByPrimaryKeySelective(Page record);

    int updateByPrimaryKeyWithBLOBs(Page record);

    int updateByPrimaryKey(Page record);
}