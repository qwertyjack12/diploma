package com.application.diploma.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.application.diploma.entity.Fixed_assets;
import com.application.diploma.repository.FixedAssetsRepository;

@Service
public class FixedAssetsService {

    private final FixedAssetsRepository fixedAssetsRepository;

    public FixedAssetsService(FixedAssetsRepository fixedAssetsRepository) {
        this.fixedAssetsRepository = fixedAssetsRepository;
    }

    public List<Fixed_assets> getAllFixed_assets() {
        return fixedAssetsRepository.findAll();
    }

    public Boolean add(Fixed_assets fixed_assets) {
        try {
            fixedAssetsRepository.save(fixed_assets);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
