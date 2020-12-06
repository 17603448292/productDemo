package com.kaida.service.impl;

import com.kaida.dao.RoleMapper;
import com.kaida.entity.Role;
import com.kaida.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("roleService")
@Transactional
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Role> selectRoleByRoleName(String roleName) {
        return roleMapper.selectRoleByRoleName(roleName);
    }

    @Override
    public int insertRole(Role role) {
        return roleMapper.insertRole(role);
    }
}
