package com.service;

import com.dto.UserProfileResponseDto;
import com.dto.UserRequestDto;
import com.dto.UserResponeDto;
import com.model.User;
import com.model.UserProfile;
import com.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public ResponseEntity<UserResponeDto> createUser(UserRequestDto userRequestDto) {
        User db =new User();

        BeanUtils.copyProperties(userRequestDto,db);
        UserProfile UDb=new UserProfile();
        BeanUtils.copyProperties(userRequestDto.getProfile(),UDb);
       db.setProfile(UDb);
        db= userRepository.save(db);


        return mapToDto(db);

    }

    private ResponseEntity<UserResponeDto> mapToDto(User db) {
        UserResponeDto dto=new UserResponeDto();
        UserProfileResponseDto t=new UserProfileResponseDto();
        BeanUtils.copyProperties(db.getProfile(),t);
        BeanUtils.copyProperties(db,dto);
        dto.setProfile(t);

        return new ResponseEntity<>(dto,HttpStatus.CREATED);
    }
}
