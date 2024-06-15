package com.application.diploma.pojo;

import lombok.Data;

@Data
public class JwtRequest {
    private String login;
    private String password;
}
