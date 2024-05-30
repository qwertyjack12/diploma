package com.application.diploma.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.application.diploma.model.StatusHistoryModel;

@Repository
public interface StatusHistoryViewRepository extends JpaRepository<StatusHistoryModel, BigInteger> {

    @Query("SELECT shm FROM StatusHistoryModel shm WHERE shm.fk_inventory_number = :invNum")
    List<StatusHistoryModel> findAllByInvNum(@Param("invNum") String invNum);

}
