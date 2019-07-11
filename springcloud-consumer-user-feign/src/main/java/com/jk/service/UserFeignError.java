package com.jk.service;

import com.jk.model.SysPermission;
import com.jk.model.SysUser;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Classname 曹龙启
 * @Description TODO
 * @Date 2019/7/11 11:40
 * @Created by ${jmh}
 */
@Component
@RequestMapping("/error")
public class UserFeignError implements UserServiceFeign{
    @Override
    public SysUser findUserByUsername(String username) {
        return null;
    }

    @Override
    public List<SysPermission> findMenuByUserId(String id) {
        return null;
    }
}
