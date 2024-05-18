package com.application.diploma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.diploma.entity.Categories;

@Repository
public interface CategoriesRepository extends JpaRepository<Categories, String> {

}
