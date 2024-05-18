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
@Table(name = "groups", schema = "public")
public class Groups implements Serializable {

    @Id
    @Column(nullable = false, length = 32)
    private String pk_group;

}
