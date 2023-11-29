package com.hensatekno.projects.kyc.service;


import com.hensatekno.projects.kyc.model.User;

import java.util.List;

public interface UserService {
    User save(User user);

    User findByUsername(String username);

    User findById(Long userId);
    List<User> findAll();
}
