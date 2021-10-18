package com.peaksoft.spring_boot.service;

import com.peaksoft.spring_boot.model.User;
import com.peaksoft.spring_boot.repo.UserRepository;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder) {

        this.userRepository = userRepository;

    }

    @Override
    public User findById(long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();

    }

    @Override
    public User save(User user) {
        user.setPassword(user.getPassword());
        return userRepository.save(user);
    }

    @Override
    public User update(User user) {
        user.setPassword(user.getPassword());
        return userRepository.save(user);
    }

    @Override
    public void remove(long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User loadUserByUsername(String s) throws UsernameNotFoundException {
        List<User> users = findAll();

        return users.stream().filter(x -> x.getFirstName().equals(s)).findAny().orElse(null);

    }
    @Override
    public User loadUserByFirstName(String s) throws UsernameNotFoundException {
        List<User> users = findAll();
        return users.stream().filter(x -> x.getFirstName().equals(s)).findAny().orElse(null);

    }
}
