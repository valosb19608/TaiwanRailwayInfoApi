package com.railway.info.dao;

import com.railway.info.model.StationExit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StationExitDao extends JpaRepository<StationExit, Integer> {
    List<StationExit> findAll();
}
