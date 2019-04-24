package com.kovynev.demo.security.jwt;

import org.springframework.security.core.AuthenticationException;

/**
 * Authetication exception for JwtAppDemo application.
 *
 * @author Alexey Kovynev
 */

public class JwtAuthenticationException extends AuthenticationException {
    public JwtAuthenticationException(String msg, Throwable t) {
        super(msg, t);
    }

    public JwtAuthenticationException(String msg) {
        super(msg);
    }
}
