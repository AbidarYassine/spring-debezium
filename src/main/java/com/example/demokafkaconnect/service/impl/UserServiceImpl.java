package com.example.demokafkaconnect.service.impl;

import com.example.demokafkaconnect.bo.CampaignBo;
import com.example.demokafkaconnect.bo.CampaignStatus;
import com.example.demokafkaconnect.dao.CampaignRepository;
import com.example.demokafkaconnect.response.CountCampaingStatus;
import com.example.demokafkaconnect.service.facade.CampaingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements CampaingService {

    private final CampaignRepository campaignRepository;

    @Override
    public List<CampaignBo> findAll() {
        return campaignRepository.findAll();
    }

    @Override
    public List<CountCampaingStatus> countCampaignByStatus() {
        List<CountCampaingStatus> countCampaingStatuses = new ArrayList<>();
        List<Object[]> list = campaignRepository.countCampaignByStatus();
        list.forEach(el -> {
            CountCampaingStatus countCampaingStatus = new CountCampaingStatus();
            countCampaingStatus.setCount((BigInteger) el[1]);
            Integer value = (Integer) el[0];
            countCampaingStatus.setCurrentStatus(CampaignStatus.get((value)));
            countCampaingStatuses.add(countCampaingStatus);
            System.out.println(el[0] + " " + el[1]);
        });
        return countCampaingStatuses;
    }
}
