package com.application.diploma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.diploma.entity.Auditories;

@Repository
public interface AuditoriesRepository extends JpaRepository<Auditories, String> {

}
