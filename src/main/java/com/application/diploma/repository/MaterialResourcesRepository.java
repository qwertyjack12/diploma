package com.application.diploma.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.application.diploma.entity.Material_resources;

@Repository
public interface MaterialResourcesRepository extends JpaRepository<Material_resources, Integer> {

    @Query("SELECT mr FROM Material_resources mr LEFT JOIN mr.fk_fixed_assets_id Fixed_assets")
    public List<Material_resources> findAllMaterRes();
}
