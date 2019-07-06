package com.jk.service;

import com.jk.model.NewsBean;
import com.jk.model.NewsType;
import com.jk.model.OrderInfo;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;

/**
 * @Classname 曹龙启
 * @Description TODO
 * @Date 2019/7/4 20:03
 * @Created by ${jmh}
 */
@RequestMapping("/error")
@Component
public class NewsServiceError implements NewsServiceFeign{
    @Override
    public OrderInfo findOrderInfo() {
        return null;
    }

    @Override
    public HashMap<String, Object> findNewsList(NewsBean news, Integer start, Integer pageSize) {
        return null;
    }

    @Override
    public List<NewsType> queryType() {
        return null;
    }

    @Override
    public void addNews(NewsBean news) {

    }

    @Override
    public NewsBean findBootDialogById(Integer id) {
        return null;
    }

    @Override
    public void updateNews(NewsBean news) {

    }

    @Override
    public void deleteNews(Integer id) {

    }
}
