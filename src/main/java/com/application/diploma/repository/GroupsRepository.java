package com.application.diploma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.diploma.entity.Groups;

@Repository
public interface GroupsRepository extends JpaRepository<Groups, String> {

}
