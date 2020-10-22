package com.railway.info.entity;

public class TrainInfo {

    private String trainNo;
    private String routeID;
    private Integer direction;
    private String trainTypeID;
    private String trainTypeCode;
    private TrainTypeName trainTypeName;
    private String tripHeadSign;
    private String startingStationID;
    private StartingStationName startingStationName;
    private String endingStationID;
    private EndingStationName endingStationName;
    private Integer tripLine;
    private Integer wheelChairFlag;
    private Integer packageServiceFlag;
    private Integer diningFlag;
    private Integer breastFeedFlag;
    private Integer bikeFlag;
    private Integer carFlag;
    private Integer dailyFlag;
    private Integer extraTrainFlag;
    private String note;

    public String getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo;
    }

    public TrainInfo withTrainNo(String trainNo) {
        this.trainNo = trainNo;
        return this;
    }

    public String getRouteID() { return routeID; }

    public void setRouteID(String routeID) { this.routeID = routeID; }

    public Integer getDirection() {
        return direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
    }

    public TrainInfo withDirection(Integer direction) {
        this.direction = direction;
        return this;
    }

    public String getTrainTypeID() {
        return trainTypeID;
    }

    public void setTrainTypeID(String trainTypeID) {
        this.trainTypeID = trainTypeID;
    }

    public TrainInfo withTrainTypeID(String trainTypeID) {
        this.trainTypeID = trainTypeID;
        return this;
    }

    public String getTrainTypeCode() {
        return trainTypeCode;
    }

    public void setTrainTypeCode(String trainTypeCode) {
        this.trainTypeCode = trainTypeCode;
    }

    public TrainInfo withTrainTypeCode(String trainTypeCode) {
        this.trainTypeCode = trainTypeCode;
        return this;
    }

    public TrainTypeName getTrainTypeName() {
        return trainTypeName;
    }

    public void setTrainTypeName(TrainTypeName trainTypeName) {
        this.trainTypeName = trainTypeName;
    }

    public TrainInfo withTrainTypeName(TrainTypeName trainTypeName) {
        this.trainTypeName = trainTypeName;
        return this;
    }

    public String getTripHeadSign() {
        return tripHeadSign;
    }

    public void setTripHeadSign(String tripHeadSign) {
        this.tripHeadSign = tripHeadSign;
    }

    public TrainInfo withTripHeadSign(String tripHeadSign) {
        this.tripHeadSign = tripHeadSign;
        return this;
    }

    public String getStartingStationID() {
        return startingStationID;
    }

    public void setStartingStationID(String startingStationID) {
        this.startingStationID = startingStationID;
    }

    public TrainInfo withStartingStationID(String startingStationID) {
        this.startingStationID = startingStationID;
        return this;
    }

    public StartingStationName getStartingStationName() {
        return startingStationName;
    }

    public void setStartingStationName(StartingStationName startingStationName) {
        this.startingStationName = startingStationName;
    }

    public TrainInfo withStartingStationName(StartingStationName startingStationName) {
        this.startingStationName = startingStationName;
        return this;
    }

    public String getEndingStationID() {
        return endingStationID;
    }

    public void setEndingStationID(String endingStationID) {
        this.endingStationID = endingStationID;
    }

    public TrainInfo withEndingStationID(String endingStationID) {
        this.endingStationID = endingStationID;
        return this;
    }

    public EndingStationName getEndingStationName() {
        return endingStationName;
    }

    public void setEndingStationName(EndingStationName endingStationName) {
        this.endingStationName = endingStationName;
    }

    public TrainInfo withEndingStationName(EndingStationName endingStationName) {
        this.endingStationName = endingStationName;
        return this;
    }

    public Integer getTripLine() {
        return tripLine;
    }

    public void setTripLine(Integer tripLine) {
        this.tripLine = tripLine;
    }

    public TrainInfo withTripLine(Integer tripLine) {
        this.tripLine = tripLine;
        return this;
    }

    public Integer getWheelChairFlag() {
        return wheelChairFlag;
    }

    public void setWheelChairFlag(Integer wheelChairFlag) {
        this.wheelChairFlag = wheelChairFlag;
    }

    public TrainInfo withWheelChairFlag(Integer wheelChairFlag) {
        this.wheelChairFlag = wheelChairFlag;
        return this;
    }

    public Integer getPackageServiceFlag() {
        return packageServiceFlag;
    }

    public void setPackageServiceFlag(Integer packageServiceFlag) {
        this.packageServiceFlag = packageServiceFlag;
    }

    public TrainInfo withPackageServiceFlag(Integer packageServiceFlag) {
        this.packageServiceFlag = packageServiceFlag;
        return this;
    }

    public Integer getDiningFlag() {
        return diningFlag;
    }

    public void setDiningFlag(Integer diningFlag) {
        this.diningFlag = diningFlag;
    }

    public TrainInfo withDiningFlag(Integer diningFlag) {
        this.diningFlag = diningFlag;
        return this;
    }

    public Integer getBreastFeedFlag() {
        return breastFeedFlag;
    }

    public void setBreastFeedFlag(Integer breastFeedFlag) {
        this.breastFeedFlag = breastFeedFlag;
    }

    public TrainInfo withBreastFeedFlag(Integer breastFeedFlag) {
        this.breastFeedFlag = breastFeedFlag;
        return this;
    }

    public Integer getBikeFlag() {
        return bikeFlag;
    }

    public void setBikeFlag(Integer bikeFlag) {
        this.bikeFlag = bikeFlag;
    }

    public TrainInfo withBikeFlag(Integer bikeFlag) {
        this.bikeFlag = bikeFlag;
        return this;
    }

    public Integer getCarFlag() {
        return carFlag;
    }

    public void setCarFlag(Integer carFlag) {
        this.carFlag = carFlag;
    }

    public TrainInfo withCarFlag(Integer carFlag) {
        this.carFlag = carFlag;
        return this;
    }

    public Integer getDailyFlag() {
        return dailyFlag;
    }

    public void setDailyFlag(Integer dailyFlag) {
        this.dailyFlag = dailyFlag;
    }

    public TrainInfo withDailyFlag(Integer dailyFlag) {
        this.dailyFlag = dailyFlag;
        return this;
    }

    public Integer getExtraTrainFlag() {
        return extraTrainFlag;
    }

    public void setExtraTrainFlag(Integer extraTrainFlag) {
        this.extraTrainFlag = extraTrainFlag;
    }

    public TrainInfo withExtraTrainFlag(Integer extraTrainFlag) {
        this.extraTrainFlag = extraTrainFlag;
        return this;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public TrainInfo withNote(String note) {
        this.note = note;
        return this;
    }
}
