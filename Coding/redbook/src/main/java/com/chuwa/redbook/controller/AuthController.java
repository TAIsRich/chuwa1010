package com.chuwa.redbook.controller;


import com.chuwa.redbook.dao.security.RoleRepository;
import com.chuwa.redbook.dao.security.UserRepository;
import com.chuwa.redbook.entity.security.Role;
import com.chuwa.redbook.entity.security.User;
import com.chuwa.redbook.payload.security.LoginDto;
import com.chuwa.redbook.payload.security.SignUpDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/signin")
    public ResponseEntity<String> authenticateUser(@RequestBody LoginDto loginDto) {

        // 把username 和 password 包裹成 一个token UsernamePasswordAuthenticationToken 给 authenticationManger 使用并认证
        // 为什么要包裹？这是语法决定的，可以不用管这些细节
        // 当账户密码认证成功， 返回一个authentication object，
        // 这个object里包含着一个principle记录当前登陆者，一个authorities来记录该登陆者访问权限，规定该user可以访问哪些API
        //  可以通过debug模式看到
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                loginDto.getAccountOrEmail(), loginDto.getPassword()
        ));

        // 将刚刚认证成功的 authentication 放入一个叫做SecurityContext的全局区域里，由SecurityContextHolder承载
        // 这样的话，后续访问更多API时就不用每次都要输入账户密码来认证，因为全局区域里已经记录的该principle
        SecurityContextHolder.getContext().setAuthentication(authentication);

        return new ResponseEntity<>("User sign-in successfully!", HttpStatus.OK);
    }

    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@RequestBody SignUpDto signUpDto) {

        // check if username is in the DB
        if (userRepository.existsByAccount(signUpDto.getAccount())) {
            return new ResponseEntity<>("This Username is already taken!", HttpStatus.BAD_REQUEST);
        }

        //check if email is in DB
        if (userRepository.existsByEmail(signUpDto.getEmail())) {
            return new ResponseEntity<>("This Email is already taken!", HttpStatus.BAD_REQUEST);
        }

        // create User Object
        User user = new User();
        user.setName(signUpDto.getName());
        user.setAccount(signUpDto.getAccount());
        user.setEmail(signUpDto.getEmail());
        user.setPassword(passwordEncoder.encode(signUpDto.getPassword()));

        Role roles = roleRepository.findByName("ROLE_ADMIN").get();
        user.setRoles(Collections.singleton(roles));
        userRepository.save(user);

        return new ResponseEntity<>("User registered successfully", HttpStatus.CREATED);
    }
}
