package de.lecuutex.testbackend.controller.mapper;


import de.lecuutex.testbackend.controller.response.UserResponse;
import de.lecuutex.testbackend.persistence.model.UserEntity;
import org.mapstruct.Mapper;

/**
 * A class created by yi.dnl - 23.09.2022 / 17:18
 */

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserResponse entityToResponse(UserEntity entity);

}
