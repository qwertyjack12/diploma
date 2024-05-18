package com.application.diploma.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

//Дополнительная сущность для связи М-М между "Основные средства" и "Стутус"

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "fixed_assets_status", schema = "public")
public class Fixed_assets_status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long pk_fixed_assets_status_id;

    @Column(nullable = false, length = 32)
    private String fk_inventory_number;

    @Column(nullable = false)
    private Integer fk_status_id;

    @Column(nullable = false, length = 128)
    private String status_note;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE", nullable = false)
    private Timestamp date_of_change;
}
