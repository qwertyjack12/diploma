package com.application.diploma.entity;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "edinica_izmer", schema = "public")
public class Edinica_izmer implements Serializable {

    @Id
    @Column(nullable = false, length = 32)
    private String pk_ed_izmer;

}