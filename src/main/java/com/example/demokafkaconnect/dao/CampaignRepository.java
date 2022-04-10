package com.example.demokafkaconnect.dao;

import com.example.demokafkaconnect.bo.CampaignBo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CampaignRepository extends JpaRepository<CampaignBo, Long> {

    @Query(value = "SELECT * FROM campaings_view", nativeQuery = true)
    @Override
    List<CampaignBo> findAll();


    @Query(value = "SELECT statut_courant,count FROM  campaings_view_status", nativeQuery = true)
    List<Object[]> countCampaignByStatus();
}
