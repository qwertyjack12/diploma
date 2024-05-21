package com.application.diploma.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.application.diploma.entity.Fixed_assets_status;

@Repository
public interface StatusHistoryRepository extends JpaRepository<Fixed_assets_status, BigInteger> {

    @Query("SELECT s FROM Fixed_assets_status s WHERE s.fk_inventory_number = :invNum")
    List<Fixed_assets_status> findAllByInvNum(@Param("invNum") String invNum);

}
