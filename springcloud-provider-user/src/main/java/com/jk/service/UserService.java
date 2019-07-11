package com.jk.service;

import com.jk.model.SysPermission;
import com.jk.model.SysUser;

import java.util.List;

/**
 * @Classname 曹龙启
 * @Description TODO
 * @Date 2019/7/11 12:10
 * @Created by ${jmh}
 */
public interface UserService {
    SysUser findUserByUsername(String username);

    List<SysPermission> findMenuByUserId(String id);
}
