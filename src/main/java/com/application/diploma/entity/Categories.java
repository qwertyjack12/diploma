package com.application.diploma.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.io.Serializable;

//Сущность "Категории"
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "categories", schema = "public")
public class Categories implements Serializable {

    @Id
    @Column(nullable = false, length = 32)
    private String pk_category;

}
