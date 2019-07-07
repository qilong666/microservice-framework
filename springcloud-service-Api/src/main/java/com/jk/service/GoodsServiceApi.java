package com.jk.service;

import com.jk.model.OrderInfo;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Classname 曹龙启
 * @Description TODO
 * @Date 2019/7/7 19:43
 * @Created by ${jmh}
 */
public interface GoodsServiceApi {

    @GetMapping("find")
    OrderInfo findOrder();
}
