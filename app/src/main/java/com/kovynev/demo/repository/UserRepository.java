package com.kovynev.demo.repository;

import com.kovynev.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface that extends {@link JpaRepository} for class {@link User}.
 *
 * @author Alexey Kovynev
 */

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String name);
}
