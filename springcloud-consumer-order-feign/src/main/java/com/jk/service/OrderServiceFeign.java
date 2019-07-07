package com.jk.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

/**
 * @Classname 曹龙启
 * @Description TODO
 * @Date 2019/7/7 21:53
 * @Created by ${jmh}
 */

@FeignClient(value = "springcloud-provider-order")
public interface OrderServiceFeign extends OrderServiceApi{
}
