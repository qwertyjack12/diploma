package com.application.diploma.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.application.diploma.entity.Auditories;
import com.application.diploma.repository.AuditoriesRepository;

@Service
public class AuditoriesService {

    private final AuditoriesRepository auditoriesRepository;

    public AuditoriesService(AuditoriesRepository auditoriesRepository) {
        this.auditoriesRepository = auditoriesRepository;
    }

    public List<Auditories> getAllAuditories() {
        return auditoriesRepository.findAll();
    }

    public Boolean add(Auditories auditories) {
        try {
            auditoriesRepository.save(auditories);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Boolean delete(Auditories auditories) {
        try {
            auditoriesRepository.delete(auditories);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
