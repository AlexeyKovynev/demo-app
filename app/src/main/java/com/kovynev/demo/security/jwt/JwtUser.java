package com.kovynev.demo.security.jwt;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.kovynev.demo.model.User;
import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Date;

/**
 * Spring Security wrapper for class {@link User}.
 *
 * @author Alexey Kovynev
 */

@Getter
public class JwtUser implements UserDetails {

    @JsonIgnore
    private final Long id;
    private final String username;
    private final String firstName;
    private final String lastName;

    @JsonIgnore
    private final String password;
    private final String email;

    private final boolean enabled;

    @JsonIgnore
    private final Date lastPasswordResetDate;
    private final Collection<? extends GrantedAuthority> authorities;

    public JwtUser(
            Long id,
            String username,
            String firstName,
            String lastName,
            String email,
            String password, Collection<? extends GrantedAuthority> authorities,
            boolean enabled,
            Date lastPasswordResetDate
    ) {
        this.id = id;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.authorities = authorities;
        this.enabled = enabled;
        this.lastPasswordResetDate = lastPasswordResetDate;
    }

    @JsonIgnore
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

}
