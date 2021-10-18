package com.peaksoft.spring_boot.service;


import com.peaksoft.spring_boot.model.Role;
import com.peaksoft.spring_boot.repo.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public Role getRoleByID(long id) {
        return roleRepository.findById(id).get();
    }
}
