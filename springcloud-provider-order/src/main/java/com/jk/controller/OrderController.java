package com.jk.controller;

import com.jk.model.OrderInfo;
import com.jk.service.OrderServiceApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @Classname 曹龙启
 * @Description TODO
 * @Date 2019/7/7 21:17
 * @Created by ${jmh}
 */
@RestController
public class OrderController implements OrderServiceApi {


    @Override
    @GetMapping("findOrder")
    public OrderInfo findOrder() {

        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setOrderId(512);
        orderInfo.setOrderInfo("ainilinlin");
        orderInfo.setOrderDate("2019-09-09");
        orderInfo.setOrderPrice(BigDecimal.valueOf(9.00));

        return orderInfo;
    }
}
