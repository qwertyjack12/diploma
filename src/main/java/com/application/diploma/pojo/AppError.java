package com.application.diploma.pojo;

import java.util.Date;

import lombok.Data;

@Data
public class AppError {
    private Integer status;
    private String message;
    private Date timestamp;

    public AppError(Integer status, String message) {
        this.status = status;
        this.message = message;
        this.timestamp = new Date();
    }
}
