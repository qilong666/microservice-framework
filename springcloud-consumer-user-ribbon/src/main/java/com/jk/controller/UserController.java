package com.jk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Classname 曹龙启
 * @Description TODO
 * @Date 2019/7/7 22:36
 * @Created by ${jmh}
 */
@RestController
public class UserController {


           @Autowired
           private RestTemplate  restTemplate;



           @GetMapping("findHello")
           public   String  findHello(){
               String  uri = "http://springcloud-provider-user/findHello";

               String forObject = restTemplate.getForObject(uri, String.class);

               return forObject;

           }




}
