package com.example.demo.domain.user.dto;

import com.example.demo.core.generic.ExtendedDTO;
import com.example.demo.domain.group.Group;
import com.example.demo.domain.role.dto.RoleDTO;

import javax.management.InstanceNotFoundException;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import java.util.Set;
import java.util.UUID;

public class UserDTO extends ExtendedDTO {

  private String firstName;

  private String lastName;

  @Email
  private String email;

  @Valid
  private Set<RoleDTO> roles;

  private Group group;
  public UserDTO() {
  }

  public UserDTO(UUID id, String firstName, String lastName, String email, Set<RoleDTO> roles, Group group) throws InstanceNotFoundException {
    super(id);
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.roles = roles;
    this.group = group;
  }

  public String getFirstName() {
    return firstName;
  }

  public UserDTO setFirstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  public String getLastName() {
    return lastName;
  }

  public UserDTO setLastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  public String getEmail() {
    return email;
  }

  public UserDTO setEmail(String email) {
    this.email = email;
    return this;
  }

  public Set<RoleDTO> getRoles() {
    return roles;
  }

  public UserDTO setRoles(Set<RoleDTO> roles) {
    this.roles = roles;
    return this;
  }

  public Group getGroup() {
    return group;
  }

  public UserDTO setGroup(Group group) {
    this.group = group;
    return this;
  }
}
