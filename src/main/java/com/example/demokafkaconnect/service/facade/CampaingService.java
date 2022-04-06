package com.example.demokafkaconnect.service.facade;

import com.example.demokafkaconnect.bo.CampaignBo;
import com.example.demokafkaconnect.response.CountCampaingStatus;

import java.util.List;

public interface CampaingService {
    List<CampaignBo> findAll();
    List<CountCampaingStatus> countCampaignByStatus();

}
