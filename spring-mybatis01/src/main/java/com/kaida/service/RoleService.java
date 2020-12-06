package com.kaida.service;

import com.kaida.entity.Role;

import java.util.List;

public interface RoleService {
    List<Role> selectRoleByRoleName(String roleName);
    int insertRole(Role role);
}
