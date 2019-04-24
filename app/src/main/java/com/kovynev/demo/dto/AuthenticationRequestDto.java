package com.kovynev.demo.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * DTO class for authentication (login) request.
 *
 * @author Alexey Kovynev
 */

@Data
public class AuthenticationRequestDto {

    @NotBlank
    @Size(min = 4, max = 50)
    private String username;

    @NotBlank
    @Size(min = 4, max = 50)
    private String password;
}
