package com.application.diploma.pojo;

import java.util.List;
import java.util.Optional;

import com.application.diploma.entity.Fixed_assets;
import com.application.diploma.model.StatusHistoryModel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FixedAssetsPojo {

    private Optional<Fixed_assets> fixedAssets;
    private List<StatusHistoryModel> fixedAssetsStatusList;

    public FixedAssetsPojo(Optional<Fixed_assets> fixedAssets, List<StatusHistoryModel> fixedAssetsStatusList) {
        this.fixedAssets = fixedAssets;
        this.fixedAssetsStatusList = fixedAssetsStatusList;
    }
}
