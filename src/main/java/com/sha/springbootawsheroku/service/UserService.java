package com.sha.springbootawsheroku.service;

import com.sha.springbootawsheroku.model.User;
import com.sha.springbootawsheroku.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author sa
 * @date 17.01.2021
 * @time 22:48
 */
@Service
public class UserService implements IUserService
{
    @Autowired
    private IUserRepository userRepository;

    @Override
    public User saveUser(User user)
    {
        user.setCreateTime(LocalDateTime.now());
        return userRepository.save(user);
    }

    @Override
    public User findByUsername(String username)
    {
        return userRepository.findByUsername(username).orElse(null);
    }

    @Override
    public List<User> findAllUsers()
    {
        return userRepository.findAll();
    }
}
