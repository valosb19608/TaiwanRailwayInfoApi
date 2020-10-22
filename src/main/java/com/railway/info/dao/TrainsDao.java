package com.railway.info.dao;

import com.railway.info.model.TrainInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TrainsDao extends JpaRepository<TrainInfo, Long> {

    List<TrainInfo> findAll();


}
