package com.kovynev.demo.dto;

import com.kovynev.demo.model.User;
import lombok.Data;

import javax.validation.constraints.Size;

/**
 * DTO class for user requests by ROLE_USER
 *
 * @author Alexey Kovynev
 */

@Data
public class UserDto {

    private Long id;

    @Size(min = 4, max = 50)
    private String username;

    @Size(min = 1, max = 100)
    private String firstName;

    @Size(min = 1, max = 100)
    private String lastName;

    @Size(min = 5, max = 255)
    private String email;

    @Size(min = 4, max = 50)
    private String password;

    public User toUser() {
        User user = new User();
        user.setId(id);
        user.setUsername(username);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        user.setPassword(password);

        return user;
    }

    public static UserDto fromUser(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setUsername(user.getUsername());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setEmail(user.getEmail());

        return userDto;
    }
}
