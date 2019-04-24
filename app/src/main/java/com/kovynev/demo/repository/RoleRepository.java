package com.kovynev.demo.repository;

import com.kovynev.demo.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface that extends {@link JpaRepository} for class {@link Role}.
 *
 * @author Alexey Kovynev
 */

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
