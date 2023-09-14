package com.contest.checker.repository;

import com.contest.checker.entity.Role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {

    Optional<Role>  findByRoleName(String roleName);

    Optional<Role> findByRoleIdAndActive(Long roleId, boolean active);

}
