package com.railway.info.entity;

public class EndingStationName {

    private String zhTw;
    private String en;

    public String getZhTw() {
        return zhTw;
    }

    public void setZhTw(String zhTw) {
        this.zhTw = zhTw;
    }

    public EndingStationName withZhTw(String zhTw) {
        this.zhTw = zhTw;
        return this;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public EndingStationName withEn(String en) {
        this.en = en;
        return this;
    }
}
