package com.example.demokafkaconnect.service.impl;

import com.example.demokafkaconnect.bo.CampaignBo;
import com.example.demokafkaconnect.dao.CampaignRepository;
import com.example.demokafkaconnect.response.CountCampaingStatus;
import com.example.demokafkaconnect.service.facade.CampaingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CampaignServiceImpl implements CampaingService {

    private final CampaignRepository campaignRepository;

    @Override
    public List<CampaignBo> findAll() {
        return campaignRepository.findAll();
    }

    @Override
    public List<CountCampaingStatus> countCampaignByStatus() {
       return campaignRepository.countCampaignByStatus();
    }
}
