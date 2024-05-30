package com.application.diploma.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.application.diploma.entity.Fixed_assets_status;
import com.application.diploma.model.StatusHistoryModel;
import com.application.diploma.repository.StatusHistoryRepository;
import com.application.diploma.repository.StatusHistoryViewRepository;

@Service
public class StatusHistoryService {

    private final StatusHistoryRepository statusHistoryRepository;
    private final StatusHistoryViewRepository statusHistoryViewRepository;

    public StatusHistoryService(StatusHistoryRepository statusHistoryRepository,
            StatusHistoryViewRepository statusHistoryViewRepository) {
        this.statusHistoryRepository = statusHistoryRepository;
        this.statusHistoryViewRepository = statusHistoryViewRepository;
    }

    public List<Fixed_assets_status> _getAllStatusByInvNum(String invNum) {
        return statusHistoryRepository.findAllByInvNum(invNum);
    }

    public List<StatusHistoryModel> getAllStatusByInvNum(String invNum) {
        return statusHistoryViewRepository.findAllByInvNum(invNum);
    }

    public List<StatusHistoryModel> getAllStatusHistory() {
        return statusHistoryViewRepository.findAll();
    }
}
