package com.chuwa.redbook.dao.security;

import com.chuwa.redbook.entity.security.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {

    // 以下方法只用声明函数名，实现方法完全由智能的JPA提供
    Optional<Role> findByName(String name);
}
