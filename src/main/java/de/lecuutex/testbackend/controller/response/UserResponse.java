package de.lecuutex.testbackend.controller.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * A class created by yi.dnl - 23.09.2022 / 17:20
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserResponse {

    private Long id;

    private String name;

    private Integer age;

    private List<UserResponse> friends;
}
