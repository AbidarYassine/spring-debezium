package com.example.demokafkaconnect.web;


import com.example.demokafkaconnect.bo.CampaignBo;
import com.example.demokafkaconnect.response.CountCampaingStatus;
import com.example.demokafkaconnect.service.facade.CampaingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/campaigns")
@CrossOrigin(value = "*", allowedHeaders = "*")
public class CampaignController {


    private final CampaingService campaingService;

    @CrossOrigin(value = "*", allowedHeaders = "*")
    @GetMapping("")
    public List<CampaignBo> findAll() {
        return campaingService.findAll();
    }

    @GetMapping("/count-status")
    @CrossOrigin(value = "*", allowedHeaders = "*")
    public List<CountCampaingStatus> getCountCampaingStatus() {
        return campaingService.countCampaignByStatus();
    }
}
