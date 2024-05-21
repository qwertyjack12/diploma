package com.application.diploma.model;

import java.sql.Timestamp;

import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "material_resources_model")
@Immutable
@Subselect("select * from material_resources_model")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder

public class MaterialResourcesModel {
    @Id
    Integer pk_material_resources_id;
    String fk_fixed_assets_id;
    Integer quantity;
    String pk_inventory_number;
    String factory_number;
    String auditory;
    String name;
    String model;
    Integer cost;
    String annotation;
    String photo;
    String fk_category;
    Timestamp commissioning_date;
}