package com.jk.controller;

import com.jk.model.OrderInfo;
import com.jk.service.GoodsServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname 曹龙启
 * @Description TODO
 * @Date 2019/7/7 19:37
 * @Created by ${jmh}
 */
@RestController
public class GoodsController {

           @Autowired
           private GoodsServiceFeign  goodsServiceFeign;


           @GetMapping("find")
           public OrderInfo  findOrder(){
               return  goodsServiceFeign.findOrder();
           }





}
