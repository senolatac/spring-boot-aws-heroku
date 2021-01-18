package com.sha.springbootawsheroku.repository;

import com.sha.springbootawsheroku.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author sa
 * @date 17.01.2021
 * @time 22:45
 */
public interface IUserRepository extends JpaRepository<User, Long>
{
    //findBy + fieldName
    Optional<User> findByUsername(String username);
}
