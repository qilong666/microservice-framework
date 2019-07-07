package com.jk.service;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Classname 曹龙启
 * @Description TODO
 * @Date 2019/7/7 19:38
 * @Created by ${jmh}
 */
@FeignClient(value = "springcloud-provider-goods",fallback = GoodsServiceError.class)
public interface GoodsServiceFeign extends GoodsServiceApi{
}
