package com.dto;

import com.model.UserProfile;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
public class UserRequestDto {
    private String name;
    private String email;
    private UserProfileRequestDto profile;
}
