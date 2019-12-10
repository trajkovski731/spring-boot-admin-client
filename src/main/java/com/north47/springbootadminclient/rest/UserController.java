package com.north47.springbootadminclient.rest;

import com.north47.springbootadminclient.persistance.domain.User;
import com.north47.springbootadminclient.rest.model.CreateUserRequestBody;
import com.north47.springbootadminclient.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{userId}")
    public ResponseEntity<User> getUser(@PathVariable(name = "userId") Long userId) {
        return ResponseEntity.ok(userService.getUser(userId));
    }

    @PostMapping
    public ResponseEntity<Long> createUser(@RequestBody CreateUserRequestBody createUserRequestBody) {
        return ResponseEntity.ok(
                userService.createUser(
                        createUserRequestBody.getFirstName(),
                        createUserRequestBody.getLastName()
                )
        );
    }
}
