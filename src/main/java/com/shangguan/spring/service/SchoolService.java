package com.shangguan.spring.service;

import com.shangguan.spring.beans.School;
public interface SchoolService{


    int deleteByPrimaryKey(Integer sid);

    int insert(School record);

    int insertSelective(School record);

    School selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(School record);

    int updateByPrimaryKey(School record);

}
