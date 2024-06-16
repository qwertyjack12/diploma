package com.application.diploma.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.application.diploma.entity.Fixed_assets;

@Repository
public interface FixedAssetsRepository
        extends JpaRepository<Fixed_assets, String>, JpaSpecificationExecutor<Fixed_assets> {

    @Query("SELECT fa FROM Fixed_assets fa WHERE  fa.pk_inventory_number = :invNum")
    Optional<Fixed_assets> findByInvNum(@Param("invNum") String invNum);

    @Query("SELECT fa FROM Fixed_assets fa WHERE fa.fk_category='Основные средства'")
    List<Fixed_assets> findAll();
}
