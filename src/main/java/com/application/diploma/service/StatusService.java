package com.application.diploma.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.application.diploma.entity.Status;
import com.application.diploma.repository.StatusRepository;

@Service
public class StatusService {

    private final StatusRepository statusRepository;

    public StatusService(StatusRepository statusRepository) {
        this.statusRepository = statusRepository;
    }

    public List<Status> getAllStatus() {
        return statusRepository.findAll();
    }

    public Boolean add(Status status) {
        try {
            statusRepository.save(status);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Boolean del(Status status) {
        try {
            statusRepository.delete(status);
            ;
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
