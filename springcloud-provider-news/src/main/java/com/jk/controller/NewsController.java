package com.jk.controller;

import com.jk.model.NewsBean;
import com.jk.model.NewsType;
import com.jk.model.OrderInfo;
import com.jk.service.NewsService;
import com.jk.service.NewsServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

/**
 * @Classname 曹龙启
 * @Description TODO
 * @Date 2019/7/4 20:50
 * @Created by ${jmh}
 */
@RestController
public class NewsController implements NewsServiceApi {


    @Override
    @GetMapping("findOrderInfo")
    public OrderInfo findOrderInfo() {
        OrderInfo order = new OrderInfo();
        order.setOrderId(1001);
        order.setOrderInfo("买了一个大西瓜");
        order.setOrderPrice(BigDecimal.valueOf(30.98));
        order.setOrderDate("2019-07-05");
        return order;
    }

    @Autowired
    private NewsService newsService;


    @Override
    @RequestMapping(value = "findNewsList")
    public HashMap<String,Object> findNewsList(@RequestBody NewsBean news,
                                               @RequestParam(value = "start") Integer start,
                                               @RequestParam(value = "pageSize")Integer pageSize) {
        return newsService.findNewsList(news,start,pageSize);
    }

    @Override
    @GetMapping("queryType")
    public List<NewsType> queryType() {
        return newsService.queryType();
    }

    @Override
    @PostMapping("addNewsTable")
    public void addNews(@RequestBody NewsBean news) {
        newsService.addNews(news);
    }

    @Override
    @GetMapping("findBootDialogById/{id}")
    public NewsBean findBootDialogById(@PathVariable(value = "id") Integer id) {
        return newsService.findBootDialogById(id);
    }

    @Override
    @PostMapping ("updateNews")
    public void updateNews(@RequestBody NewsBean news) {
        newsService.updateNews(news);
    }

    @Override
    @DeleteMapping("deleteNews/{id}")
    public void deleteNews(@PathVariable(value = "id") Integer id) {
        newsService.deleteNews(id);
    }




}
