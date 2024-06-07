package com.application.diploma.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.application.diploma.entity.Auditories;
import com.application.diploma.service.AuditoriesService;

@RestController
public class AuditoriesController {

    private final AuditoriesService auditoriesService;

    public AuditoriesController(AuditoriesService auditoriesService) {
        this.auditoriesService = auditoriesService;
    }

    @GetMapping("/auditories")
    public List<Auditories> getAllAuditories() {
        return auditoriesService.getAllAuditories();
    }

    @PostMapping("/auditories/add")
    public Boolean add(@RequestBody Auditories auditories) {
        System.out.println("auditory is " + (auditories == null ? "nope " : auditories.getPk_auditory()));
        return auditoriesService.add(auditories);
    }

    @DeleteMapping("/auditories/delete")
    public Boolean delete(@RequestBody Auditories auditories) {
        System.out.println("Deleting auditory: " + auditories.getPk_auditory());
        return auditoriesService.delete(auditories);
    }
}
