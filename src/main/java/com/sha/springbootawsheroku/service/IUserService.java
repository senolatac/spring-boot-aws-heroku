package com.sha.springbootawsheroku.service;

import com.sha.springbootawsheroku.model.User;

import java.util.List;

/**
 * @author sa
 * @date 17.01.2021
 * @time 22:48
 */
public interface IUserService
{
    User saveUser(User user);

    User findByUsername(String username);

    List<User> findAllUsers();
}
