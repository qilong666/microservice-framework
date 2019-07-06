package com.jk.service;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Classname 曹龙启
 * @Description TODO
 * @Date 2019/7/4 20:02
 * @Created by ${jmh}
 */
@FeignClient(value = "springcloud-provider-news",fallback = NewsServiceError.class)
public interface NewsServiceFeign extends NewsServiceApi{
}
