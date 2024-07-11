package net.javaguides.springboot.service;

import net.javaguides.springboot.entity.User;

import java.util.List;

public interface UserService {
    User createUser(User user);
    User getUerById(Long userId);
    List<User> getAllUsers();

    User updateUser(User user);
    void deleteUser(Long userId);
}
