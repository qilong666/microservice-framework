package com.jk.mapper;

import com.jk.model.SysUser;
import org.apache.ibatis.annotations.Param;

public interface SysUserMapper {

    SysUser findUserByUsername(@Param(value = "username") String username);

    int deleteByPrimaryKey(String id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
}