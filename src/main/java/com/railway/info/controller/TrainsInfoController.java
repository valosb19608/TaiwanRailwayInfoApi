package com.railway.info.controller;

import com.railway.info.dao.TrainsDao;
import com.railway.info.model.TrainInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class TrainsInfoController {

    @Autowired
    TrainsDao trainsDao;

    @GetMapping("/getAllTrainsInfo")
    public List<TrainInfo> getAllTrainsInfo() {
        List<TrainInfo> result = trainsDao.findAll();

        return result;
    }

    /*
    @GetMapping("")
    public String getTodayTrains() {
        return "";
    }

    @GetMapping("")
    public String getGeneralTrains() {
        return "";
    }

    @GetMapping("")
    public String getSpecificTrains() {
        return "";
    }
*/
    /*
    查詢可搭乘的列車資訊
     */
    @GetMapping("/getRideTrainsInfo/{trainID}")
    public String getRideTrainsInfo(@PathVariable("trainID") String trainID) {
        return "";
    }
}
