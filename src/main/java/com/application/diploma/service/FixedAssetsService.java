package com.application.diploma.service;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.application.diploma.entity.Fixed_assets;
import com.application.diploma.pojo.FixedAssetsPojo;
import com.application.diploma.repository.FixedAssetsRepository;
import com.application.diploma.repository.StatusHistoryViewRepository;

@Service
public class FixedAssetsService {

    private final FixedAssetsRepository fixedAssetsRepository;
    private final StatusHistoryViewRepository statusHistoryViewRepository;

    public FixedAssetsService(FixedAssetsRepository fixedAssetsRepository,
            StatusHistoryViewRepository statusHistoryViewRepository) {
        this.fixedAssetsRepository = fixedAssetsRepository;
        this.statusHistoryViewRepository = statusHistoryViewRepository;
    }

    public List<Fixed_assets> getAllFixed_assets(Specification<Fixed_assets> specification) {
        return fixedAssetsRepository.findAll(specification);
    }

    public FixedAssetsPojo getFixedAssetsByInvNum(String invNum) {
        return new FixedAssetsPojo(fixedAssetsRepository.findByInvNum(invNum),
                statusHistoryViewRepository.findAllByInvNum(invNum));
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

    public Boolean delete(Fixed_assets fixed_assets) {
        try {
            fixedAssetsRepository.delete(fixed_assets);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Specification<Fixed_assets> buildSpecification(String auditory) {
        Specification<Fixed_assets> specification = Specification.where(null);

        if (auditory != null) {
            specification = specification
                    .and((root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("auditory"), auditory));
        }

        return specification;
    }
}
