package com.application.diploma.entity;

//Сущность "Статус"

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "status", schema = "public")
public class Status implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer pk_status_id;

    @Column(nullable = false, length = 32, unique = true)
    private String status;

}
