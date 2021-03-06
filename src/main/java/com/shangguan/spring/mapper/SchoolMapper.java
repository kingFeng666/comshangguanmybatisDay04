package com.shangguan.spring.mapper;

import com.shangguan.spring.beans.School;

public interface SchoolMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(School record);

    int insertSelective(School record);

    School selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(School record);

    int updateByPrimaryKey(School record);
}