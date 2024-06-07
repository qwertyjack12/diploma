package com.application.diploma.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.application.diploma.entity.Departments;
import com.application.diploma.service.DepartmentsService;

@RestController
public class DepartmentsController {

    private final DepartmentsService departmentsService;

    public DepartmentsController(DepartmentsService departmentsService) {
        this.departmentsService = departmentsService;
    }

    @GetMapping("/departaments")
    public List<Departments> getAllDepartments() {
        return departmentsService.getAllDepartments();
    }

    @PostMapping("/departaments/add")
    public Boolean add(@RequestBody Departments departments) {
        System.out.println("department is " + (departments == null ? "nope " : departments.getPk_department()));
        return departmentsService.add(departments);
    }

    @DeleteMapping("/departaments/delete")
    public Boolean delete(@RequestBody Departments departments) {
        System.out.println("Deleting department: " + departments.getPk_department());
        return departmentsService.delete(departments);
    }

}
