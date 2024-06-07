package com.application.diploma.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "departments", schema = "public")
public class Departments implements Serializable {

    @Id
    @Column(nullable = false, length = 128)
    private String pk_department;

}
