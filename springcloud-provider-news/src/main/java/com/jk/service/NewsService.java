package com.jk.service;

import com.jk.model.NewsBean;
import com.jk.model.NewsType;

import java.util.HashMap;
import java.util.List;

/**
 * @Classname 曹龙启
 * @Description TODO
 * @Date 2019/7/5 19:24
 * @Created by ${jmh}
 */
public interface NewsService {
    HashMap<String, Object> findNewsList(NewsBean news, Integer start, Integer pageSize);

    List<NewsType> queryType();

    void addNews(NewsBean news);

    NewsBean findBootDialogById(Integer id);

    void updateNews(NewsBean news);

    void deleteNews(Integer id);
}
