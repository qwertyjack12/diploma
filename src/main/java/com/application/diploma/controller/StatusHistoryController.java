package com.application.diploma.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.application.diploma.entity.Fixed_assets_status;
import com.application.diploma.model.StatusHistoryModel;
import com.application.diploma.service.StatusHistoryService;

@RestController
public class StatusHistoryController {

    private final StatusHistoryService statusHistoryService;

    public StatusHistoryController(StatusHistoryService statusHistoryService) {
        this.statusHistoryService = statusHistoryService;
    }

    @GetMapping("/status_history/{invNum}")
    public List<Fixed_assets_status> getAllStatusByInvNum(@PathVariable("invNum") String invNum) {
        return statusHistoryService._getAllStatusByInvNum(invNum);
    }

    @GetMapping("/status_history")
    public List<StatusHistoryModel> getAllStatusHistory() {
        return statusHistoryService.getAllStatusHistory();
    }

    @PostMapping("/status_history/add")
    public Boolean add(@RequestBody Fixed_assets_status fixed_assets_status) {
        System.out
                .println("model is " + (fixed_assets_status == null ? "nope " : fixed_assets_status.getFk_status_id()));
        return statusHistoryService.add(fixed_assets_status);
    }

}
