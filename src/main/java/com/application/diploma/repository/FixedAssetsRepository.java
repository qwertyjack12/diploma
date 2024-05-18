package com.application.diploma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.diploma.entity.Fixed_assets;

@Repository
public interface FixedAssetsRepository extends JpaRepository<Fixed_assets, String> {

}
