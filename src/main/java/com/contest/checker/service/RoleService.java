package com.contest.checker.service;

import com.contest.checker.entity.Role;

import java.util.List;
import java.util.Optional;

public interface RoleService {
    Role createRole(Role role);

    List<Role> getAllRoles();

    Optional<Role> getActiveSingleRole(Long id, boolean active);

    Optional<Role> getSingleRole(Long id);

    void permanentlyDeleteRole(Long id);
}
