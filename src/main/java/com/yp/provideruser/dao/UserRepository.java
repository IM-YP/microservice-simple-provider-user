package com.yp.provideruser.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yp.provideruser.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
