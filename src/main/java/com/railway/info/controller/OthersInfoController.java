package com.railway.info.controller;

import com.railway.info.dao.NewsDao;
import com.railway.info.model.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class OthersInfoController {

    @Autowired
    NewsDao newsDao;

    @GetMapping("/getNews")
    public List<News> getNews() {
        List<News> newsList = newsDao.findAll(
                Sort.by("publishTime").descending()
        );

        return newsList.subList(0, 10);
    }

    @GetMapping("/healthCheck")
    public String healthCheck() {
        return "true";
    }
}
