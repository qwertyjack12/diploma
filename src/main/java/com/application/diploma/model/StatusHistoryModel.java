package com.application.diploma.model;

import java.math.BigInteger;
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
@Table(name = "fixed_assets_status_model")
@Immutable
@Subselect("select * from fixed_assets_status_model")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder

public class StatusHistoryModel {
    @Id
    BigInteger pk_fixed_assets_status_id;
    String fk_inventory_number;
    Integer fk_status_id;
    String status;
    String status_note;
    Timestamp date_of_change;
}