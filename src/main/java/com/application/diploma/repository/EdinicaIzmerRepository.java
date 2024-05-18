package com.application.diploma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.diploma.entity.Edinica_izmer;

@Repository
public interface EdinicaIzmerRepository extends JpaRepository<Edinica_izmer, String> {

}
