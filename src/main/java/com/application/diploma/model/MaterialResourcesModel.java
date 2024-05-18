package com.application.diploma.model;

import java.sql.Timestamp;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder

public class MaterialResourcesModel {
    Integer pk_material_resources_id;
    String fk_fixed_assets_is;
    Integer quantity;
    String pk_inventory_number;
    String facroty_number;
    String auditory;
    String name;
    String model;
    Integer cost;
    String annotation;
    String photo;
    String fk_categoty;
    Timestamp commissioning_date;
}
