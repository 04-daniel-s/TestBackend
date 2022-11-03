package de.lecuutex.testbackend.service;

import de.lecuutex.testbackend.controller.request.UserRequest;
import de.lecuutex.testbackend.persistence.model.UserEntity;
import de.lecuutex.testbackend.persistence.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;

/**
 * A class created by yi.dnl - 24.09.2022 / 22:58
 */

@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;

    public UserEntity createUser(UserRequest request) {

        UserEntity userEntity = UserEntity.builder()
                .name(request.getName())
                .age(request.getAge())
                .friends(Collections.emptyList())
                .build();

       return  userRepository.save(userEntity);
    }
}
