package com.application.diploma.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.application.diploma.entity.Fixed_assets;
import com.application.diploma.entity.Material_resources;
import com.application.diploma.model.MaterialResourcesModel;
import com.application.diploma.pojo.MaterialResourcesPojo;
import com.application.diploma.repository.FixedAssetsRepository;
import com.application.diploma.repository.MaterialResourcesRepository;
import com.application.diploma.repository.MaterialResourcesViewRepository;
import com.application.diploma.repository.StatusHistoryViewRepository;

@Service
public class MaterialResourcesService {

    private final MaterialResourcesViewRepository materialResourcesViewRepository;
    private final MaterialResourcesRepository materialResourcesRepository;
    private final StatusHistoryViewRepository statusHistoryViewRepository;
    private final FixedAssetsRepository fixedAssetsRepository;

    public MaterialResourcesService(MaterialResourcesViewRepository materialResourcesViewRepository,
            MaterialResourcesRepository materialResourcesRepository,
            StatusHistoryViewRepository statusHistoryViewRepository,
            FixedAssetsRepository fixedAssetsRepository) {
        this.materialResourcesViewRepository = materialResourcesViewRepository;
        this.materialResourcesRepository = materialResourcesRepository;
        this.statusHistoryViewRepository = statusHistoryViewRepository;
        this.fixedAssetsRepository = fixedAssetsRepository;
    }

    public List<MaterialResourcesModel> getAllMaterialResources() {
        return materialResourcesViewRepository.findAll();
    }

    public MaterialResourcesPojo getMaterialResourcesByInvNum(String invNum) {
        return new MaterialResourcesPojo(materialResourcesViewRepository.findByInvNum(invNum),
                statusHistoryViewRepository.findAllByInvNum(invNum));
    }

    public Boolean add(MaterialResourcesModel materialResourcesModel) {
        try {
            Fixed_assets fixedAssets = new Fixed_assets();
            fixedAssets.setPk_inventory_number(materialResourcesModel.getFk_fixed_assets_id());
            fixedAssets.setFactory_number(materialResourcesModel.getFactory_number());
            fixedAssets.setFk_auditory(materialResourcesModel.getFk_auditory());
            fixedAssets.setName(materialResourcesModel.getName());
            fixedAssets.setModel(materialResourcesModel.getModel());
            fixedAssets.setCost(materialResourcesModel.getCost());
            fixedAssets.setAnnotation(materialResourcesModel.getAnnotation());
            fixedAssets.setPhoto(materialResourcesModel.getPhoto());
            fixedAssets.setFk_category(materialResourcesModel.getFk_category());
            fixedAssets.setCommissioning_date(materialResourcesModel.getCommissioning_date());
            fixedAssets.setFk_group(materialResourcesModel.getFk_group());
            fixedAssets.setFk_ed_izmer(materialResourcesModel.getFk_ed_izmer());

            fixedAssetsRepository.save(fixedAssets);

            Material_resources materialResources = new Material_resources();
            materialResources.setFk_fixed_assets_id(materialResourcesModel.getFk_fixed_assets_id());
            materialResources.setQuantity(materialResourcesModel.getQuantity());

            materialResourcesRepository.save(materialResources);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Boolean edit(MaterialResourcesModel materialResourcesModel) {
        try {
            Fixed_assets fixedAssets = new Fixed_assets();
            fixedAssets.setPk_inventory_number(materialResourcesModel.getFk_fixed_assets_id());
            fixedAssets.setFactory_number(materialResourcesModel.getFactory_number());
            fixedAssets.setFk_auditory(materialResourcesModel.getFk_auditory());
            fixedAssets.setName(materialResourcesModel.getName());
            fixedAssets.setModel(materialResourcesModel.getModel());
            fixedAssets.setCost(materialResourcesModel.getCost());
            fixedAssets.setAnnotation(materialResourcesModel.getAnnotation());
            fixedAssets.setPhoto(materialResourcesModel.getPhoto());
            fixedAssets.setFk_category(materialResourcesModel.getFk_category());
            fixedAssets.setCommissioning_date(materialResourcesModel.getCommissioning_date());
            fixedAssets.setFk_group(materialResourcesModel.getFk_group());
            fixedAssets.setFk_ed_izmer(materialResourcesModel.getFk_ed_izmer());

            fixedAssetsRepository.save(fixedAssets);

            Material_resources materialResources = new Material_resources();
            materialResources.setPk_material_resources_id(materialResourcesModel.getPk_material_resources_id());
            materialResources.setFk_fixed_assets_id(materialResourcesModel.getFk_fixed_assets_id());
            materialResources.setQuantity(materialResourcesModel.getQuantity());

            materialResourcesRepository.save(materialResources);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Boolean delete(MaterialResourcesModel materialResourcesModel) {
        try {
            Fixed_assets fixedAssets = new Fixed_assets();
            fixedAssets.setPk_inventory_number(materialResourcesModel.getPk_inventory_number());

            fixedAssetsRepository.delete(fixedAssets);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
