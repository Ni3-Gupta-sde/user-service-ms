package com.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
public class ErrorApi {
    private int status;
    private int meaasage;
    private LocalDateTime localDateTime;
}
