package com.application.diploma.entity;

//Сущность "Основные средства"

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "fixed_assets", schema = "public")
public class Fixed_assets implements Serializable {

    @Id
    @Column(nullable = false, length = 32)
    private String pk_inventory_number;

    @Column(nullable = false, length = 32)
    private String factory_number;

    @Column(length = 8)
    private String fk_auditory;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, length = 32)
    private String model;

    @Column(nullable = true)
    private Double cost;

    @Column(nullable = false)
    private String annotation;

    @Column(nullable = false, length = 128)
    private String photo;

    @Column(nullable = false, length = 32)
    private String fk_category;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Timestamp commissioning_date;

    @Column(nullable = false, length = 32)
    private String fk_group;

    @Column(nullable = false, length = 32)
    private String fk_ed_izmer;
}
