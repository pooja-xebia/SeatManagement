package com.xebia.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xebia.login.entity.User;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);

    @Override
    void delete(User user);

}
