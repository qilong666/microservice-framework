package com.jk.service;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Classname 曹龙启
 * @Description TODO
 * @Date 2019/7/11 11:40
 * @Created by ${jmh}
 */
@FeignClient(value = "springcloud-provider-user",fallback = UserFeignError.class)
public interface UserServiceFeign extends SysUserService{



}
