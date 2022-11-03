package de.lecuutex.testbackend.controller.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;

import javax.validation.constraints.NotNull;

/**
 * A class created by yi.dnl - 24.09.2022 / 22:57
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {

    @NotNull
    private String name;

    @NotNull
    private Integer age;
}
