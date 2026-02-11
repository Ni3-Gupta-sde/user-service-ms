package com.dto;

import com.model.UserProfile;
import lombok.Data;

@Data
public class UserResponeDto {
    private Long id;
    private String name;
    private String email;
    private UserProfileResponseDto profile;
}
