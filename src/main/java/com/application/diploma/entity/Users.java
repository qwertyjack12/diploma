package com.application.diploma.entity;

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

    @Column(nullable = false, length = 64, unique = true)
    private String login;

    @Column(nullable = false, length = 256)
    private String password;

    @Column(nullable = false, length = 32)
    private String position;

    @Column(nullable = false, length = 32)
    private String access_rights;

    @Column(nullable = false, length = 128)
    private String first_name;

    @Column(nullable = false, length = 128)
    private String last_name;

    @Column(nullable = false, length = 128)
    private String surname;

    @Column(nullable = false, length = 6)
    private String work_phone;

    @Column(nullable = false, length = 11)
    private String mobile_phone;

    @Column(nullable = false, length = 254, unique = true)
    private String e_mail;

    @Column(nullable = false, length = 64)
    private String department;

}
