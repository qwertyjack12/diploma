package com.application.diploma.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.application.diploma.entity.Fixed_assets_status;
import com.application.diploma.repository.StatusHistoryRepository;

@Service
public class StatusHistoryService {

    private final StatusHistoryRepository statusHistoryRepository;

    public StatusHistoryService(StatusHistoryRepository statusHistoryRepository) {
        this.statusHistoryRepository = statusHistoryRepository;
    }

    public List<Fixed_assets_status> getAllStatusByInvNum(String invNum) {
        return statusHistoryRepository.findAllByInvNum(invNum);
    }
}
