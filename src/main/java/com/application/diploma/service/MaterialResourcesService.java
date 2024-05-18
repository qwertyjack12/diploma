package com.application.diploma.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.application.diploma.entity.Material_resources;
import com.application.diploma.repository.MaterialResourcesRepository;

@Service
public class MaterialResourcesService {

    private final MaterialResourcesRepository materialResourcesRepository;

    public MaterialResourcesService(MaterialResourcesRepository materialResourcesRepository) {
        this.materialResourcesRepository = materialResourcesRepository;
    }

    public List<Material_resources> getALlMaterial_resources() {
        return materialResourcesRepository.findAllMaterRes();
    }

    public Boolean add(Material_resources material_resources) {
        try {
            materialResourcesRepository.save(material_resources);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
