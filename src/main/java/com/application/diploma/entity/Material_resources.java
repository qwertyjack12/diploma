package com.application.diploma.entity;

//Сущность "Материальные запасы"

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "material_resources", schema = "public")
public class Material_resources {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer pk_material_resources_id;

    @Column(nullable = false, length = 32)
    private String fk_fixed_assets_id;

    @Column(nullable = false)
    private Integer quantity;

}
