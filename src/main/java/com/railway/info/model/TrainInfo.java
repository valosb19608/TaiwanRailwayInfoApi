package com.railway.info.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "train_info", schema = "taiwan_railway_api_info")
public class TrainInfo {
    private String trainNo;
    private String routeId;
    private int direction;
    private String trainTypeId;
    private String trainTypeCode;
    private String trainTypeName;
    private String tripHeadSign;
    private Integer tripLine;
    private int wheelChairFlag;
    private int packageServiceFlag;
    private int diningFlag;
    private int breastFeedFlag;
    private int bikeFlag;
    private int carFlag;
    private int dailyFlag;
    private int extraTrainFlag;
    private String note;
    private int category;

    @Id
    @Column(name = "train_no")
    public String getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo;
    }

    @Basic
    @Column(name = "route_id")
    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    @Basic
    @Column(name = "direction")
    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    @Basic
    @Column(name = "train_type_id")
    public String getTrainTypeId() {
        return trainTypeId;
    }

    public void setTrainTypeId(String trainTypeId) {
        this.trainTypeId = trainTypeId;
    }

    @Basic
    @Column(name = "train_type_code")
    public String getTrainTypeCode() {
        return trainTypeCode;
    }

    public void setTrainTypeCode(String trainTypeCode) {
        this.trainTypeCode = trainTypeCode;
    }

    @Basic
    @Column(name = "train_type_name")
    public String getTrainTypeName() {
        return trainTypeName;
    }

    public void setTrainTypeName(String trainTypeName) {
        this.trainTypeName = trainTypeName;
    }

    @Basic
    @Column(name = "trip_head_sign")
    public String getTripHeadSign() {
        return tripHeadSign;
    }

    public void setTripHeadSign(String tripHeadSign) {
        this.tripHeadSign = tripHeadSign;
    }

    @Basic
    @Column(name = "trip_line")
    public Integer getTripLine() {
        return tripLine;
    }

    public void setTripLine(Integer tripLine) {
        this.tripLine = tripLine;
    }

    @Basic
    @Column(name = "wheel_chair_flag")
    public int getWheelChairFlag() {
        return wheelChairFlag;
    }

    public void setWheelChairFlag(int wheelChairFlag) {
        this.wheelChairFlag = wheelChairFlag;
    }

    @Basic
    @Column(name = "package_service_flag")
    public int getPackageServiceFlag() {
        return packageServiceFlag;
    }

    public void setPackageServiceFlag(int packageServiceFlag) {
        this.packageServiceFlag = packageServiceFlag;
    }

    @Basic
    @Column(name = "dining_flag")
    public int getDiningFlag() {
        return diningFlag;
    }

    public void setDiningFlag(int diningFlag) {
        this.diningFlag = diningFlag;
    }

    @Basic
    @Column(name = "breast_feed_flag")
    public int getBreastFeedFlag() {
        return breastFeedFlag;
    }

    public void setBreastFeedFlag(int breastFeedFlag) {
        this.breastFeedFlag = breastFeedFlag;
    }

    @Basic
    @Column(name = "bike_flag")
    public int getBikeFlag() {
        return bikeFlag;
    }

    public void setBikeFlag(int bikeFlag) {
        this.bikeFlag = bikeFlag;
    }

    @Basic
    @Column(name = "car_flag")
    public int getCarFlag() {
        return carFlag;
    }

    public void setCarFlag(int carFlag) {
        this.carFlag = carFlag;
    }

    @Basic
    @Column(name = "daily_flag")
    public int getDailyFlag() {
        return dailyFlag;
    }

    public void setDailyFlag(int dailyFlag) {
        this.dailyFlag = dailyFlag;
    }

    @Basic
    @Column(name = "extra_train_flag")
    public int getExtraTrainFlag() {
        return extraTrainFlag;
    }

    public void setExtraTrainFlag(int extraTrainFlag) {
        this.extraTrainFlag = extraTrainFlag;
    }

    @Basic
    @Column(name = "note")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Basic
    @Column(name = "category")
    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrainInfo trainInfo = (TrainInfo) o;
        return direction == trainInfo.direction &&
                wheelChairFlag == trainInfo.wheelChairFlag &&
                packageServiceFlag == trainInfo.packageServiceFlag &&
                diningFlag == trainInfo.diningFlag &&
                breastFeedFlag == trainInfo.breastFeedFlag &&
                bikeFlag == trainInfo.bikeFlag &&
                carFlag == trainInfo.carFlag &&
                dailyFlag == trainInfo.dailyFlag &&
                extraTrainFlag == trainInfo.extraTrainFlag &&
                category == trainInfo.category &&
                Objects.equals(trainNo, trainInfo.trainNo) &&
                Objects.equals(routeId, trainInfo.routeId) &&
                Objects.equals(trainTypeId, trainInfo.trainTypeId) &&
                Objects.equals(trainTypeCode, trainInfo.trainTypeCode) &&
                Objects.equals(trainTypeName, trainInfo.trainTypeName) &&
                Objects.equals(tripHeadSign, trainInfo.tripHeadSign) &&
                Objects.equals(tripLine, trainInfo.tripLine) &&
                Objects.equals(note, trainInfo.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trainNo, routeId, direction, trainTypeId, trainTypeCode, trainTypeName, tripHeadSign, tripLine, wheelChairFlag, packageServiceFlag, diningFlag, breastFeedFlag, bikeFlag, carFlag, dailyFlag, extraTrainFlag, note, category);
    }
}
