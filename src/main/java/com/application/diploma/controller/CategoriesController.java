package com.application.diploma.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.application.diploma.entity.Categories;
import com.application.diploma.service.CategoriesService;

@RestController
public class CategoriesController {

    private final CategoriesService categoriesService;

    public CategoriesController(CategoriesService categoriesService) {
        this.categoriesService = categoriesService;
    }

    @GetMapping("/categories")
    public List<Categories> getAllCategories() {
        return categoriesService.getALlCategories();
    }

    @PostMapping("/categories/add")
    public Boolean add(@RequestBody Categories categories) {
        System.out.println("model is " + (categories == null ? "nope " : categories.getPk_category()));
        return categoriesService.add(categories);
    }
}
