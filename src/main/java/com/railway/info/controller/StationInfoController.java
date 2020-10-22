package com.railway.info.controller;

import com.railway.info.dao.StationDao;
import com.railway.info.dao.StationExitDao;
import com.railway.info.model.Station;
import com.railway.info.model.StationExit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class StationInfoController {

    @Autowired
    StationDao stationDao;
    @Autowired
    StationExitDao stationExitDao;

    @GetMapping("/getStationInfo")
    public List<Station> getStationInfo() {
        return stationDao.findAll();
    }

    @GetMapping("getStationExitInfo")
    public List<StationExit> getStationExitInfo() {
        return stationExitDao.findAll();
    }
}
