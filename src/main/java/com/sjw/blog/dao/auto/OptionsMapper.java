package com.sjw.blog.dao.auto;

import com.sjw.blog.entity.Options;
import com.sjw.blog.entity.OptionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;


public interface OptionsMapper {
    int countByExample(OptionsExample example);

    int deleteByExample(OptionsExample example);

    int deleteByPrimaryKey(Integer optionId);

    int insert(Options record);

    int insertSelective(Options record);

    List<Options> selectByExample(OptionsExample example);

    Options selectByPrimaryKey(Integer optionId);

    int updateByExampleSelective(@Param("record") Options record, @Param("example") OptionsExample example);

    int updateByExample(@Param("record") Options record, @Param("example") OptionsExample example);

    int updateByPrimaryKeySelective(Options record);

    int updateByPrimaryKey(Options record);
}