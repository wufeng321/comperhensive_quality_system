package com.as.dao;

import com.as.dataobject.UserPassword;

public interface UserPasswordMapper {

    int deleteByPrimaryKey(Integer id);
    int insert(UserPassword record);
    int insertSelective(UserPassword record);
    UserPassword selectByPrimaryKey(Integer id);
    UserPassword selectByUserID(String userId);
    int updateByPrimaryKeySelective(UserPassword record);
    int updateByPrimaryKey(UserPassword record);
}