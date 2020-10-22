package com.railway.info.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StationName {

    private String zhTw;
    private String en;

    public String getZhTw() {
        return zhTw;
    }

    public void setZhTw(String zhTw) {
        this.zhTw = zhTw;
    }

    public StationName withZhTw(String zhTw) {
        this.zhTw = zhTw;
        return this;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public StationName withEn(String en) {
        this.en = en;
        return this;
    }

}
