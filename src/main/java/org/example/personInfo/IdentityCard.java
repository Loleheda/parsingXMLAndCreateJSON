package org.example.personInfo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IdentityCard {
    private int idType;
    private int idSeries;
    private int idNum;

    public IdentityCard(int idType, int idSeries, int idNum) {
        this.idType = idType;
        this.idSeries = idSeries;
        this.idNum = idNum;
    }

    @JsonProperty("IdType")
    public int getIdType() {
        return idType;
    }

    @JsonProperty("IdSeries")
    public int getIdSeries() {
        return idSeries;
    }

    @JsonProperty("IdNum")
    public int getIdNum() {
        return idNum;
    }

    @Override
    public String toString() {
        return "IdentityCard{" +
                "idType=" + idType +
                ", idSeries=" + idSeries +
                ", idNum=" + idNum +
                '}';
    }
}
