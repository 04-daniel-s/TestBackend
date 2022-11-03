package de.lecuutex.testbackend.controller;

import de.lecuutex.testbackend.controller.mapper.UserMapper;
import de.lecuutex.testbackend.controller.request.UserRequest;
import de.lecuutex.testbackend.controller.response.UserResponse;
import de.lecuutex.testbackend.persistence.repository.UserRepository;
import de.lecuutex.testbackend.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

/**
 * A class created by yi.dnl - 23.09.2022 / 17:09
 */

@Controller
@AllArgsConstructor
public class UserController {

    private UserRepository userRepository;

    private UserService userService;

    private UserMapper userMapper;

    @GetMapping("/search/id")
    public ResponseEntity<UserResponse> getUser(@RequestParam Long id) {
        if (userRepository.findAllById(id).isEmpty()) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(userMapper.entityToResponse(userRepository.findAllById(id).get()));
    }

    @GetMapping("/search/name")
    public ResponseEntity<UserResponse> getUser(@RequestParam String name) {
        if (userRepository.findAllByName(name).isEmpty()) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(userMapper.entityToResponse(userRepository.findAllByName(name).get()));
    }

    @GetMapping("/search")
    public ResponseEntity<List<UserResponse>> getAll() {
        return ResponseEntity.ok(userRepository.findAll().stream().map(v-> userMapper.entityToResponse(v)).collect(Collectors.toList()));
    }

    @PostMapping("/add")
    public ResponseEntity<UserResponse> postUser(@RequestBody @Valid UserRequest request) {
        return ResponseEntity.ok(userMapper.entityToResponse(userService.createUser(request)));
    }
}
