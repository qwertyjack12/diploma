package com.application.diploma.pojo;

import java.util.List;
import java.util.Optional;

import com.application.diploma.model.MaterialResourcesModel;
import com.application.diploma.model.StatusHistoryModel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MaterialResourcesPojo {

    private Optional<MaterialResourcesModel> materialResourcesModel;
    private List<StatusHistoryModel> fixedAssetsStatusList;

    public MaterialResourcesPojo(Optional<MaterialResourcesModel> materialResourcesModel,
            List<StatusHistoryModel> fixedAssetsStatusList) {
        this.materialResourcesModel = materialResourcesModel;
        this.fixedAssetsStatusList = fixedAssetsStatusList;
    }

}
