package com.jk.service;

import com.jk.model.SysPermission;
import com.jk.model.SysUser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Classname 曹龙启
 * @Description TODO
 * @Date 2019/7/11 11:58
 * @Created by ${jmh}
 */
public interface SysUserService {

    @RequestMapping("/findUserByUsername")
    SysUser findUserByUsername(@RequestParam(value = "username") String username);

    @RequestMapping("/findMenuByUserId")
    List<SysPermission> findMenuByUserId(@RequestParam(value = "id") String id);
}
