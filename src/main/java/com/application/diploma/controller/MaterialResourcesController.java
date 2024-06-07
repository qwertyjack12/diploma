package com.application.diploma.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.application.diploma.model.MaterialResourcesModel;
import com.application.diploma.pojo.MaterialResourcesPojo;
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
    public MaterialResourcesPojo getMaterialResourcesByInvNum(@PathVariable("invNum") String invNum) {
        return materialResourcesService.getMaterialResourcesByInvNum(invNum);
    }

    @PostMapping("/material_res_card/add")
    public Boolean add(@RequestBody MaterialResourcesModel materialResourcesModel) {
        System.out.println("Material resources: " + materialResourcesModel.getPk_inventory_number());
        return materialResourcesService.add(materialResourcesModel);
    }

    @PostMapping("material_res_card/edit")
    public Boolean edit(@RequestBody MaterialResourcesModel materialResourcesModel) {
        System.out.println("Edit material resource: " + materialResourcesModel.getPk_inventory_number());
        return materialResourcesService.edit(materialResourcesModel);
    }

    @DeleteMapping("/material_res_card/delete")
    public Boolean delete(@RequestBody MaterialResourcesModel materialResourcesModel) {
        System.out.println("Delete material resource: " + materialResourcesModel.getName());
        return materialResourcesService.delete(materialResourcesModel);
    }

}
