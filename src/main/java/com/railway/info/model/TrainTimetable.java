package com.railway.info.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "train_timetable", schema = "taiwan_railway_api_info")
public class TrainTimetable implements Serializable {
    private String trainId;
    private int stopSequence;
    private String stationId;
    private String arrivalTime;
    private String departureTime;

    @Id
    @Column(name = "train_id")
    public String getTrainId() {
        return trainId;
    }

    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }

    @Id
    @Column(name = "stop_sequence")
    public int getStopSequence() {
        return stopSequence;
    }

    public void setStopSequence(int stopSequence) {
        this.stopSequence = stopSequence;
    }

    @Basic
    @Column(name = "station_id")
    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    @Basic
    @Column(name = "arrival_time")
    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    @Basic
    @Column(name = "departure_time")
    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrainTimetable that = (TrainTimetable) o;
        return stopSequence == that.stopSequence &&
                Objects.equals(trainId, that.trainId) &&
                Objects.equals(stationId, that.stationId) &&
                Objects.equals(arrivalTime, that.arrivalTime) &&
                Objects.equals(departureTime, that.departureTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trainId, stopSequence, stationId, arrivalTime, departureTime);
    }
}
