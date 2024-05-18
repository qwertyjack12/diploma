package com.application.diploma.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.application.diploma.entity.Material_resources;
import com.application.diploma.service.MaterialResourcesService;

@RestController
public class MaterialResourcesController {

    private final MaterialResourcesService materialResourcesService;

    public MaterialResourcesController(MaterialResourcesService materialResourcesService) {
        this.materialResourcesService = materialResourcesService;
    }

    @GetMapping("/material_res_card")
    public List<Material_resources> getAllMaterial_resources() {
        return materialResourcesService.getALlMaterial_resources();
    }

    @PostMapping("/material_res_card/add")
    public Boolean add(@RequestBody Material_resources material_resources) {
        System.out.println("model is "
                + (material_resources == null ? "nope " : material_resources.getPk_material_resources_id()));
        return materialResourcesService.add(material_resources);
    }

}
