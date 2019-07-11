package com.jk.service;

import com.jk.mapper.SysPermissionMapper;
import com.jk.mapper.SysUserMapper;
import com.jk.model.SysPermission;
import com.jk.model.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname 曹龙启
 * @Description TODO
 * @Date 2019/7/11 12:11
 * @Created by ${jmh}
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
     private SysUserMapper  sysUserMapper;

    @Autowired
     private SysPermissionMapper  sysPermissionMapper;



    @Override
    public SysUser findUserByUsername(String username) {

        SysUser userByUsername = sysUserMapper.findUserByUsername(username);


        return userByUsername;
    }

    @Override
    public List<SysPermission> findMenuByUserId(String id) {
        return sysPermissionMapper.findMenuByUserId(id);
    }
}
