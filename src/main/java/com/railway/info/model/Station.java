package com.railway.info.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "station", schema = "taiwan_railway_api_info")
public class Station {
    private String stationUid;
    private String stationId;
    private String stationNameTw;
    private String stationNameEn;
    private BigDecimal positionLat;
    private BigDecimal positionLon;
    private String stationAddress;
    private String stationPhone;
    private Integer stationClass;
    private String stationUrl;
    private Timestamp modifyTime;

    @Id
    @Column(name = "station_uid")
    public String getStationUid() {
        return stationUid;
    }

    public void setStationUid(String stationUid) {
        this.stationUid = stationUid;
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
    @Column(name = "station_name_tw")
    public String getStationNameTw() {
        return stationNameTw;
    }

    public void setStationNameTw(String stationNameTw) {
        this.stationNameTw = stationNameTw;
    }

    @Basic
    @Column(name = "station_name_en")
    public String getStationNameEn() {
        return stationNameEn;
    }

    public void setStationNameEn(String stationNameEn) {
        this.stationNameEn = stationNameEn;
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
    @Column(name = "station_address")
    public String getStationAddress() {
        return stationAddress;
    }

    public void setStationAddress(String stationAddress) {
        this.stationAddress = stationAddress;
    }

    @Basic
    @Column(name = "station_phone")
    public String getStationPhone() {
        return stationPhone;
    }

    public void setStationPhone(String stationPhone) {
        this.stationPhone = stationPhone;
    }

    @Basic
    @Column(name = "station_class")
    public Integer getStationClass() {
        return stationClass;
    }

    public void setStationClass(Integer stationClass) {
        this.stationClass = stationClass;
    }

    @Basic
    @Column(name = "station_url")
    public String getStationUrl() {
        return stationUrl;
    }

    public void setStationUrl(String stationUrl) {
        this.stationUrl = stationUrl;
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
        Station station = (Station) o;
        return Objects.equals(stationUid, station.stationUid) &&
                Objects.equals(stationId, station.stationId) &&
                Objects.equals(stationNameTw, station.stationNameTw) &&
                Objects.equals(stationNameEn, station.stationNameEn) &&
                Objects.equals(positionLat, station.positionLat) &&
                Objects.equals(positionLon, station.positionLon) &&
                Objects.equals(stationAddress, station.stationAddress) &&
                Objects.equals(stationPhone, station.stationPhone) &&
                Objects.equals(stationClass, station.stationClass) &&
                Objects.equals(stationUrl, station.stationUrl) &&
                Objects.equals(modifyTime, station.modifyTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stationUid, stationId, stationNameTw, stationNameEn, positionLat, positionLon, stationAddress, stationPhone, stationClass, stationUrl, modifyTime);
    }
}
