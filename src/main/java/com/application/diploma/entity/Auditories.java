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
@Table(name = "auditories", schema = "public")
public class Auditories implements Serializable {

    @Id
    @Column(nullable = false, length = 8)
    private String pk_auditory;

}
