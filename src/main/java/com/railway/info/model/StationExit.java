package com.railway.info.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "station_exit", schema = "taiwan_railway_api_info")
public class StationExit {
    private int sn;
    private String exitId;
    private String stationId;
    private String exitNameTw;
    private String exitNameEn;
    private BigDecimal positionLat;
    private BigDecimal positionLon;
    private String locationDescription;
    private int stair;
    private int escalator;
    private int elevator;
    private Timestamp modifyTime;

    @Id
    @Column(name = "sn")
    public int getSn() {
        return sn;
    }

    public void setSn(int sn) {
        this.sn = sn;
    }

    @Basic
    @Column(name = "exit_id")
    public String getExitId() {
        return exitId;
    }

    public void setExitId(String exitId) {
        this.exitId = exitId;
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
    @Column(name = "exit_name_tw")
    public String getExitNameTw() {
        return exitNameTw;
    }

    public void setExitNameTw(String exitNameTw) {
        this.exitNameTw = exitNameTw;
    }

    @Basic
    @Column(name = "exit_name_en")
    public String getExitNameEn() {
        return exitNameEn;
    }

    public void setExitNameEn(String exitNameEn) {
        this.exitNameEn = exitNameEn;
    }

    @Basic
    @Column(name = "position_lat")
    public BigDecimal getPositionLat() {
        return positionLat;
    }

    public void setPositionLat(BigDecimal positionLat) {
        this.positionLat = positionLat;
    }

    @Basic
    @Column(name = "position_lon")
    public BigDecimal getPositionLon() {
        return positionLon;
    }

    public void setPositionLon(BigDecimal positionLon) {
        this.positionLon = positionLon;
    }

    @Basic
    @Column(name = "location_description")
    public String getLocationDescription() {
        return locationDescription;
    }

    public void setLocationDescription(String locationDescription) {
        this.locationDescription = locationDescription;
    }

    @Basic
    @Column(name = "stair")
    public int getStair() {
        return stair;
    }

    public void setStair(int stair) {
        this.stair = stair;
    }

    @Basic
    @Column(name = "escalator")
    public int getEscalator() {
        return escalator;
    }

    public void setEscalator(int escalator) {
        this.escalator = escalator;
    }

    @Basic
    @Column(name = "elevator")
    public int getElevator() {
        return elevator;
    }

    public void setElevator(int elevator) {
        this.elevator = elevator;
    }

    @Basic
    @Column(name = "modify_time")
    public Timestamp getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Timestamp modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StationExit that = (StationExit) o;
        return sn == that.sn &&
                stair == that.stair &&
                escalator == that.escalator &&
                elevator == that.elevator &&
                Objects.equals(exitId, that.exitId) &&
                Objects.equals(stationId, that.stationId) &&
                Objects.equals(exitNameTw, that.exitNameTw) &&
                Objects.equals(exitNameEn, that.exitNameEn) &&
                Objects.equals(positionLat, that.positionLat) &&
                Objects.equals(positionLon, that.positionLon) &&
                Objects.equals(locationDescription, that.locationDescription) &&
                Objects.equals(modifyTime, that.modifyTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sn, exitId, stationId, exitNameTw, exitNameEn, positionLat, positionLon, locationDescription, stair, escalator, elevator, modifyTime);
    }
}
