package com.application.diploma.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.application.diploma.entity.Fixed_assets_status;
import com.application.diploma.entity.Material_resources;
import com.application.diploma.model.MaterialResourcesModel;
import com.application.diploma.service.MaterialResourcesService;

@RestController
public class MaterialResourcesController {

    private final MaterialResourcesService materialResourcesService;

    public MaterialResourcesController(MaterialResourcesService materialResourcesService) {
        this.materialResourcesService = materialResourcesService;
    }

    @GetMapping("/material_res_card")
    public List<MaterialResourcesModel> getAllMaterialResources() {
        return materialResourcesService.getAllMaterialResources();
    }

    @GetMapping("/material_res_card/{invNum}")
    public Optional<MaterialResourcesModel> getMaterialResourcesByInvNum(@PathVariable("invNum") String invNum) {
        return materialResourcesService.getMaterialResourcesByInvNum(invNum);
    }

    @PostMapping("/material_res_card/add")
    public Boolean add(@RequestBody Material_resources material_resources) {
        System.out.println("model is "
                + (material_resources == null ? "nope " : material_resources.getPk_material_resources_id()));
        return materialResourcesService.add(material_resources);
    }

}
