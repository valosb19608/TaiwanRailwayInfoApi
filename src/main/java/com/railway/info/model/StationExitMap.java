package com.railway.info.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "station_exit_map", schema = "taiwan_railway_api_info")
public class StationExitMap {
    private int sn;
    private String stationId;
    private String mapUrl;

    @Id
    @Column(name = "sn")
    public int getSn() {
        return sn;
    }

    public void setSn(int sn) {
        this.sn = sn;
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
    @Column(name = "map_url")
    public String getMapUrl() {
        return mapUrl;
    }

    public void setMapUrl(String mapUrl) {
        this.mapUrl = mapUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StationExitMap that = (StationExitMap) o;
        return sn == that.sn &&
                Objects.equals(stationId, that.stationId) &&
                Objects.equals(mapUrl, that.mapUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sn, stationId, mapUrl);
    }
}
