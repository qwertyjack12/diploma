package com.application.diploma.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.application.diploma.entity.Groups;
import com.application.diploma.entity.Material_resources;
import com.application.diploma.model.MaterialResourcesModel;
import com.application.diploma.repository.MaterialResourcesRepository;
import com.application.diploma.repository.MaterialResourcesViewRepository;

@Service
public class MaterialResourcesService {

    private final MaterialResourcesViewRepository materialResourcesViewRepository;
    private final MaterialResourcesRepository materialResourcesRepository;

    public MaterialResourcesService(MaterialResourcesViewRepository materialResourcesViewRepository,
            MaterialResourcesRepository materialResourcesRepository) {
        this.materialResourcesViewRepository = materialResourcesViewRepository;
        this.materialResourcesRepository = materialResourcesRepository;
    }

    public List<MaterialResourcesModel> getAllMaterialResources() {
        return materialResourcesViewRepository.findAll();
    }

    public Optional<MaterialResourcesModel> getMaterialResourcesByInvNum(String invNum) {
        return materialResourcesViewRepository.findByInvNum(invNum);
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
