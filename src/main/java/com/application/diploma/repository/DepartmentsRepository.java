package com.application.diploma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.diploma.entity.Departments;

@Repository
public interface DepartmentsRepository extends JpaRepository<Departments, String> {

}
