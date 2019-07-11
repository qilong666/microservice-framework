package com.jk.controller;

import com.jk.service.UserServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname 曹龙启
 * @Description TODO
 * @Date 2019/7/11 11:39
 * @Created by ${jmh}
 */
@RestController
public class UserController {

        @Autowired
        private    UserServiceFeign   userServiceFeign;




}
