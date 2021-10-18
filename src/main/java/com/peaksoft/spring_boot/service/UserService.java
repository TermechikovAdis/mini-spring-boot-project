package com.peaksoft.spring_boot.service;

import com.peaksoft.spring_boot.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    User findById(long id);
    List<User> findAll();
    User save(User user);
    User update(User user);
    void remove(long id);
    UserDetails loadUserByUsername(String s);
    User loadUserByFirstName (String s);
}

