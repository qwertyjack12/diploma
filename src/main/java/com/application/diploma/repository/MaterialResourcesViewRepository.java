package com.application.diploma.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.application.diploma.model.MaterialResourcesModel;

@Repository
public interface MaterialResourcesViewRepository extends JpaRepository<MaterialResourcesModel, Integer> {

    @Query("SELECT mr FROM MaterialResourcesModel mr WHERE mr.pk_inventory_number = :invNum")
    Optional<MaterialResourcesModel> findByInvNum(@Param("invNum") String invNum);

}