package com.peaksoft.spring_boot.service;

import com.peaksoft.spring_boot.model.Role;

import java.util.List;

public interface RoleService {
    List<Role> getAllRoles();
    Role getRoleByID(long id);
}