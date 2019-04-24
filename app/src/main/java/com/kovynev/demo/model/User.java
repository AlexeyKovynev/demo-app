package com.kovynev.demo.model;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.util.List;


/**
 * Simple domain object that represents application user.
 *
 * @author Alexey Kovynev
 */

@Entity
@Table(name = "USR")
@Data
public class User extends BaseEntity {

    @Column(name = "username")
    @Length(min = 4, max = 50)
    private String username;

    @Column(name = "first_name")
    @Length(min = 1, max = 100)
    private String firstName;

    @Column(name = "last_name")
    @Length(min = 1, max = 100)
    private String lastName;

    @Column(name = "email")
    @Length(min = 5, max = 255)
    private String email;

    @Column(name = "password")
    @NotBlank
    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "USR_ROLE",
            joinColumns = {@JoinColumn(name = "USER_ID", referencedColumnName = "ID")},
            inverseJoinColumns = {@JoinColumn(name = "ROLE_ID", referencedColumnName = "ID")})
    private List<Role> roles;
}
