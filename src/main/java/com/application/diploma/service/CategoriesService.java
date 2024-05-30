package com.application.diploma.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.application.diploma.entity.Categories;
import com.application.diploma.repository.CategoriesRepository;

@Service
public class CategoriesService {

    private final CategoriesRepository categoriesRepository;

    public CategoriesService(CategoriesRepository categoriesRepository) {
        this.categoriesRepository = categoriesRepository;
    }

    public List<Categories> getALlCategories() {
        return categoriesRepository.findAll();
    }

    public Boolean add(Categories categories) {
        try {
            categoriesRepository.save(categories);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Boolean delete(Categories categories) {
        try {
            categoriesRepository.delete(categories);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
