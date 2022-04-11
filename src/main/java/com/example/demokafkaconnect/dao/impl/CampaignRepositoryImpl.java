package com.example.demokafkaconnect.dao.impl;

import com.example.demokafkaconnect.bo.CampaignBo;
import com.example.demokafkaconnect.dao.CampaignRepository;
import com.example.demokafkaconnect.response.CountCampaingStatus;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Component
public class CampaignRepositoryImpl implements CampaignRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<CampaignBo> findAll() {
        Query query = entityManager.createNativeQuery("SELECT * FROM campaings_view");
        return query.getResultList();
    }

    @Override
    public List<CountCampaingStatus> countCampaignByStatus() {
        Query query = entityManager.createNativeQuery("SELECT * FROM campaings_view_status");
        return query.getResultList();
    }
}
