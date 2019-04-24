package com.kovynev.demo.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

/**
 * Simple domain object that represents application user's role - ADMIN, USER, etc.
 *
 * @author Alexey Kovynev
 */

@Entity
@Table(name = "ROLE")
@Data
public class Role extends BaseEntity {

    @Column(name = "NAME")
    private String name;

    @ManyToMany(mappedBy = "roles", fetch = FetchType.LAZY)
    private List<User> users;

    @Override
    public String toString() {
        return "Role{" +
                "id: " + super.getId() + ", " +
                "name: " + name + "}";
    }
}
