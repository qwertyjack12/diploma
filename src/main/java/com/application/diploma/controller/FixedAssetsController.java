package com.application.diploma.controller;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.application.diploma.entity.Fixed_assets;
import com.application.diploma.pojo.FixedAssetsPojo;
import com.application.diploma.service.FixedAssetsService;

@RestController
public class FixedAssetsController {

    private final FixedAssetsService fixedAssetsService;

    public FixedAssetsController(FixedAssetsService fixedAssetsService) {
        this.fixedAssetsService = fixedAssetsService;
    }

    @GetMapping("/fixed_assets_card")
    public List<Fixed_assets> getAllFixed_assets(@RequestParam(required = false, name = "auditory") String auditory) {

        Specification<Fixed_assets> specification = fixedAssetsService.buildSpecification(auditory);
        return fixedAssetsService.getAllFixed_assets(specification);
    }

    @GetMapping("/fixed_assets_card/{invNum}")
    public FixedAssetsPojo getFixedAssetsByInvNum(@PathVariable("invNum") String invNum) {
        return fixedAssetsService.getFixedAssetsByInvNum(invNum);
    }

    @PostMapping("/fixed_assets_card/add")
    public Boolean add(@RequestBody Fixed_assets fixed_assets) {
        System.out.println("model is " + (fixed_assets == null ? "nope " : fixed_assets.getPk_inventory_number()));
        return fixedAssetsService.add(fixed_assets);
    }

    @DeleteMapping("/fixed_assets_card/delete")
    public Boolean delete(@RequestBody Fixed_assets fixed_assets) {
        System.out.println("Deleting fixed assets with inventory number: " + fixed_assets.getPk_inventory_number());
        return fixedAssetsService.delete(fixed_assets);
    }
}
