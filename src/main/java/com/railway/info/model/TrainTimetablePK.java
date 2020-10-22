package com.railway.info.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class TrainTimetablePK implements Serializable {
    private String trainId;
    private int stopSequence;

    @Column(name = "train_id")
    @Id
    public String getTrainId() {
        return trainId;
    }

    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }

    @Column(name = "stop_sequence")
    @Id
    public int getStopSequence() {
        return stopSequence;
    }

    public void setStopSequence(int stopSequence) {
        this.stopSequence = stopSequence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrainTimetablePK that = (TrainTimetablePK) o;
        return stopSequence == that.stopSequence &&
                Objects.equals(trainId, that.trainId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trainId, stopSequence);
    }
}
