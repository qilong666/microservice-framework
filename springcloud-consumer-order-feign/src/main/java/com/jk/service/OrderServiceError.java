package com.jk.service;

import com.jk.model.OrderInfo;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Classname 曹龙启
 * @Description TODO
 * @Date 2019/7/7 21:55
 * @Created by ${jmh}
 */
@Component
@RequestMapping("/error")
public class OrderServiceError implements OrderServiceFeign{
    @Override
    public OrderInfo findOrder() {
        return null;
    }
}
