package com.kaida.dao;

import com.kaida.entity.Role;

import java.util.List;

public interface RoleMapper {
    List<Role> selectRoleByRoleName(String roleName);
    int insertRole(Role role);
}
