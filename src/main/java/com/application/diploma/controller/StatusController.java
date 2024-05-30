package com.application.diploma.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.application.diploma.entity.Status;
import com.application.diploma.service.StatusService;

@RestController
public class StatusController {

    private final StatusService statusService;

    public StatusController(StatusService statusService) {
        this.statusService = statusService;
    }

    @GetMapping("/status")
    public List<Status> getAllStatus() {
        return statusService.getAllStatus();
    }

    @PostMapping("status/add")
    public Boolean add(@RequestBody Status status) {
        System.out.println("model is " + (status == null ? "nope " : status.getStatus()));
        return statusService.add(status);
    }

    @DeleteMapping("status/delete")
    public Boolean delete(@RequestBody Status status) {
        System.out.println("Deleting status: " + status.getStatus());
        return statusService.delete(status);
    }
}
