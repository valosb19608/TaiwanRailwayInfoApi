package com.railway.info.dao;

import com.railway.info.model.Station;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StationDao extends JpaRepository<Station, Integer> {
    List<Station> findAll();


}
