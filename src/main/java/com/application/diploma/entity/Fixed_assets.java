package com.application.diploma.entity;

//Сущность "Основные средства"

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;

import java.io.Serializable;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "fixed_assets", schema = "public")
public class Fixed_assets implements Serializable {

    @Id
    @Column(nullable = false, length = 32)
    private String pk_inventory_number;

    @Column(nullable = false, length = 32)
    private String factory_number;

    @Column(nullable = false, length = 8)
    private String auditory;

    @Column(nullable = false, length = 32)
    private String name;

    @Column(nullable = false, length = 32)
    private String model;

    @Column(nullable = false)
    private Integer cost;

    @Column(nullable = false)
    private String annotation;

    @Column(nullable = false, length = 128)
    private String photo;

    @Column(nullable = false)
    private Integer fk_category;

}
