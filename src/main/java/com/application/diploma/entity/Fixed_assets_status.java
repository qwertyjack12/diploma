package com.application.diploma.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

//Дополнительная сущность для связи М-М между "Основные средства" и "Стутус"

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "fixed_assets_status", schema = "public")
public class Fixed_assets_status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer pk_fixed_assets_status_id;

    @Column(nullable = false, length = 32)
    private String fk_inventory_number;

    @Column(nullable = false)
    private Integer fk_status_id;
}
