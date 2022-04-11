package com.example.demokafkaconnect.dao;

import com.example.demokafkaconnect.bo.CampaignBo;
import com.example.demokafkaconnect.response.CountCampaingStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CampaignRepository {

    List<CampaignBo> findAll();

    List<CountCampaingStatus> countCampaignByStatus();
}
