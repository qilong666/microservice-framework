package com.jk.service;

import com.jk.model.OrderInfo;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Classname 曹龙启
 * @Description TODO
 * @Date 2019/7/7 19:39
 * @Created by ${jmh}
 */
@RequestMapping("/error")
@Component
public class GoodsServiceError implements GoodsServiceFeign{
    @Override
    public OrderInfo findOrder() {
        return null;
    }
}
