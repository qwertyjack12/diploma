package com.application.diploma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.diploma.entity.Status;

@Repository
public interface StatusRepository extends JpaRepository<Status, Integer> {

}
