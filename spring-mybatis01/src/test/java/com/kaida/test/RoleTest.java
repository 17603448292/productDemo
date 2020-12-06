package com.kaida.test;

import com.kaida.entity.Role;
import com.kaida.service.RoleService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class RoleTest {
    private Logger logger=Logger.getLogger(RoleTest.class);
    @Test
    public void selectRoleByUserName(){
       ApplicationContext Context = new ClassPathXmlApplicationContext("spring-mybatis-config.xml");
       RoleService roleService = (RoleService) Context.getBean("roleService");
        Role role = new Role();
        role.setId(8);
        role.setRoleCode("888");
        role.setRoleName("地主");
        roleService.insertRole(role);
//        List<Role> roles = roleService.selectRoleByRoleName("主");
//        for (Role role : roles) {
//            logger.debug(role);
//        }

    }
}
