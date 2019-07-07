package com.jk.controller;

import com.jk.model.OrderInfo;
import com.jk.service.OrderServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @Classname 曹龙启
 * @Description TODO
 * @Date 2019/7/7 21:53
 * @Created by ${jmh}
 */
@RestController
public class OrderController {



           @Autowired
           private OrderServiceFeign  orderServiceFeign;


            @GetMapping("findOrder")
           public OrderInfo  findOrder(){

                return orderServiceFeign.findOrder();
            }




}
