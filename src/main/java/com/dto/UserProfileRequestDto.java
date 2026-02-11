package com.dto;

import com.model.User;
import lombok.Data;

@Data
public class UserProfileRequestDto {
    private String address;
    private String phone;
}
