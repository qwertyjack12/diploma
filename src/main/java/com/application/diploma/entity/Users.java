package com.application.diploma.entity;

import java.util.Collection;

//Сущность "Пользователи"

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "users", schema = "public")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer pk_user_id;

    @Column(length = 64, unique = true)
    private String login;

    @Column(length = 256)
    private String password;

    @Column(length = 32)
    private String position;

    @Column(length = 32)
    private String access_rights;

    @Column(length = 128)
    private String first_name;

    @Column(length = 128)
    private String last_name;

    @Column(length = 128)
    private String surname;

    @Column(length = 6)
    private String work_phone;

    @Column(length = 11)
    private String mobile_phone;

    @Column(length = 254, unique = true)
    private String e_mail;

    @Column(length = 128)
    private String fk_department;

    @Column
    private String photo;

    @ManyToMany
    @JoinTable(name = "users_roles", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Collection<Role> roles;

}
