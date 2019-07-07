package com.jk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname 曹龙启
 * @Description TODO
 * @Date 2019/7/7 22:40
 * @Created by ${jmh}
 */
@RestController
public class UserController {


       @GetMapping("findHello")
       public  String  findHello(){
           return "我是董事长，爱好赚钱！！！，今年18岁";
       }









}
