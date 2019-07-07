package com.jk.controller;

import com.jk.model.OrderInfo;
import com.jk.service.GoodsServiceApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @Classname 曹龙启
 * @Description TODO
 * @Date 2019/7/7 19:42
 * @Created by ${jmh}
 */
@RestController
public class GoodsController implements GoodsServiceApi {


    @Override
    @GetMapping("find")
    public OrderInfo findOrder() {

        OrderInfo order = new OrderInfo();
          order.setOrderId(007);
          order.setOrderInfo("买个小米云动手表");
          order.setOrderDate("2019-07-08");
          order.setOrderPrice(BigDecimal.valueOf(679.99));


        return order;
    }
}
