package com.railway.info.dao;

import com.railway.info.model.News;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NewsDao extends JpaRepository<News, Integer> {
    List<News> findAll();

}
