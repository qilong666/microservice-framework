package com.jk.controller;

import com.jk.model.SysPermission;
import com.jk.model.SysUser;
import com.jk.service.SysUserService;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Classname 曹龙启
 * @Description TODO
 * @Date 2019/7/7 22:40
 * @Created by ${jmh}
 */
@RestController
public class UserController implements SysUserService {


       @GetMapping("findHello")
       public  String  findHello(){
           return "我是董事长，爱好赚钱！！！，今年18岁";
       }


       @Autowired
       private   UserService   userService;


    @Override
    @RequestMapping("/findUserByUsername")
    public SysUser findUserByUsername(@RequestParam(value = "username") String username) {
        return userService.findUserByUsername(username);
    }

    @Override
    @RequestMapping("/findMenuByUserId")
    public List<SysPermission> findMenuByUserId(@RequestParam(value = "id") String id) {
        return userService.findMenuByUserId(id);
    }


}
