package com.example.demokafkaconnect.response;

import com.example.demokafkaconnect.bo.CampaignStatus;

import java.math.BigInteger;

public class CountCampaingStatus {

    private CampaignStatus currentStatus;

    private BigInteger count;

    public CountCampaingStatus(CampaignStatus currentStatus, BigInteger count) {
        this.currentStatus = currentStatus;
        this.count = count;
    }

    public CountCampaingStatus() {
    }

    public CampaignStatus getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(CampaignStatus currentStatus) {
        this.currentStatus = currentStatus;
    }

    public BigInteger getCount() {
        return count;
    }

    public void setCount(BigInteger count) {
        this.count = count;
    }
}
