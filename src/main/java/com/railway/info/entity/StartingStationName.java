package com.railway.info.entity;

public class StartingStationName {

    private String zhTw;
    private String en;

    public String getZhTw() {
        return zhTw;
    }

    public void setZhTw(String zhTw) {
        this.zhTw = zhTw;
    }

    public StartingStationName withZhTw(String zhTw) {
        this.zhTw = zhTw;
        return this;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public StartingStationName withEn(String en) {
        this.en = en;
        return this;
    }
}
