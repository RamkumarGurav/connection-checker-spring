package com.contest.checker.service;

import com.contest.checker.entity.Role;
import com.contest.checker.error.CustomException;
import com.contest.checker.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService{


    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role createRole(Role role) {

        Optional<Role> roleOptional = roleRepository.findByRoleName(role.getRoleName());

        if(roleOptional.isPresent()){
            throw new CustomException("This Role has already Created", HttpStatus.BAD_REQUEST);
        }

        return roleRepository.save(role);
    }

    @Override
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public Optional<Role> getActiveSingleRole(Long id, boolean active) {
        return roleRepository.findByRoleIdAndActive(id,active);
    }

    @Override
    public Optional<Role> getSingleRole(Long id) {
        return roleRepository.findById(id);
    }

    @Override
    public void permanentlyDeleteRole(Long id) {
         roleRepository.deleteById(id);
    }
}
