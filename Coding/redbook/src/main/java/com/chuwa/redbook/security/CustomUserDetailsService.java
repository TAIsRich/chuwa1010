package com.chuwa.redbook.security;

import com.chuwa.redbook.dao.security.UserRepository;
import com.chuwa.redbook.entity.security.Role;
import com.chuwa.redbook.entity.security.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

//Security Service 层可以由Spring框架帮我们实现很大一部分工作， 只需实现UserDetailService接口
@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String accountOrEmail) throws UsernameNotFoundException {
        // 在userRepository中寻找user，根据account或者email，如果没找到则抛出UsernameNotFoundException
        User user = userRepository.findByAccountOrEmail(accountOrEmail, accountOrEmail)
                .orElseThrow(() -> new UsernameNotFoundException("User not found with account or email" + accountOrEmail));
        // 由于该方法返回类型为UserDetails，所以我们需要把user的信息放入到Spring自己的User Class 里
        // 以下是固定写法
        return new org.springframework.security.core.userdetails.User(
                user.getEmail(),
                user.getPassword(),
                mapRolesToAuthorities(user.getRoles())
        );
    }

    private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Set<Role> roles) {
        return roles.stream()
                .map(role -> new SimpleGrantedAuthority(role.getName()))
                .collect(Collectors.toList());

    }
}
