package com.dto;

import com.model.User;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
public class UserProfileResponseDto {
    private Long id;
    private String address;
    private String phone;
}
