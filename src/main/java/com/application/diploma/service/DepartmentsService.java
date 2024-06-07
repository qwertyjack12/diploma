package com.application.diploma.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.application.diploma.entity.Departments;
import com.application.diploma.repository.DepartmentsRepository;

@Service
public class DepartmentsService {

    private final DepartmentsRepository departmentsRepository;

    public DepartmentsService(DepartmentsRepository departmentsRepository) {
        this.departmentsRepository = departmentsRepository;
    }

    public List<Departments> getAllDepartments() {
        return departmentsRepository.findAll();
    }

    public Boolean add(Departments departments) {
        try {
            departmentsRepository.save(departments);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Boolean delete(Departments departments) {
        try {
            departmentsRepository.delete(departments);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
