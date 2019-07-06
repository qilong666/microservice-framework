package com.jk.service;

import com.jk.model.NewsBean;
import com.jk.model.NewsType;
import com.jk.model.OrderInfo;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/**
 * @Classname 曹龙启
 * @Description TODO
 * @Date 2019/7/4 20:46
 * @Created by ${jmh}
 */
public interface NewsServiceApi {


    @GetMapping("findOrderInfo")
    OrderInfo findOrderInfo();

    @RequestMapping(value = "findNewsList")
    HashMap<String,Object> findNewsList( @RequestBody NewsBean news,
                                         @RequestParam(value = "start") Integer start,
                                         @RequestParam(value = "pageSize") Integer pageSize);

    @GetMapping("queryType")
    List<NewsType> queryType();

    @PostMapping("addNewsTable")
    void addNews(NewsBean news);

    @GetMapping("findBootDialogById/{id}")
    NewsBean findBootDialogById(@PathVariable(value="id")Integer id);

    @PostMapping ("updateNews")
    void updateNews(NewsBean news);



    @DeleteMapping("deleteNews/{id}")
    void deleteNews(@PathVariable(value="id") Integer id);

}
