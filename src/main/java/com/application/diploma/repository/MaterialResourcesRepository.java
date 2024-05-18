package com.application.diploma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.diploma.entity.Material_resources;

@Repository
public interface MaterialResourcesRepository extends JpaRepository<Material_resources, Integer> {

}
