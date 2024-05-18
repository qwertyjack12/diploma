package com.application.diploma.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.application.diploma.entity.Fixed_assets;
import com.application.diploma.service.FixedAssetsService;

@RestController
public class FixedAssetsController {

    private final FixedAssetsService fixedAssetsService;

    public FixedAssetsController(FixedAssetsService fixedAssetsService) {
        this.fixedAssetsService = fixedAssetsService;
    }

    @GetMapping("/fixed_assets_card")
    public List<Fixed_assets> getAllFixed_assets() {
        return fixedAssetsService.getAllFixed_assets();
    }

    @PostMapping("/fixed_assets_card/add")
    public Boolean add(@RequestBody Fixed_assets fixed_assets) {
        System.out.println("model is " + (fixed_assets == null ? "nope " : fixed_assets.getPk_inventory_number()));
        return fixedAssetsService.add(fixed_assets);
    }
}
