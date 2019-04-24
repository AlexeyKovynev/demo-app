package com.kovynev.demo.controller;

import com.kovynev.demo.dto.UserDto;
import com.kovynev.demo.model.User;
import com.kovynev.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

/**
 * REST controller user connected requests.
 *
 * @author Alexey Kovynev
 */

@RestController
@RequestMapping(value = "/api/users")
public class UserRestController {
    private final UserService userService;

    @Autowired
    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable(name = "id") Long id) {
        User user = userService.findById(id);

        if (user == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        UserDto result = UserDto.fromUser(user);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @GetMapping(value = "/")
    public List<UserDto> getAllUsers() {
        return userService.getAll().stream().map(UserDto::fromUser).collect(Collectors.toList());
    }

    @PostMapping(value = "/")
    public UserDto create(@RequestBody @Valid UserDto dto) {
        return UserDto.fromUser(userService.create(dto.toUser()));
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable(name = "id") Long id) {
        userService.delete(id);
    }

}
