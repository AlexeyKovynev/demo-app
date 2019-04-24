package com.kovynev.demo.service;

import com.kovynev.demo.model.User;

import java.util.List;

/**
 * Service interface for class {@link User}.
 *
 * @author Alexey Kovynev
 */

public interface UserService {

    User create(User user);

    List<User> getAll();

    User findByUsername(String username);

    User findById(Long id);

    void delete(Long id);
}
