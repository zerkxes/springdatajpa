package com.aniket.springjpa.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aniket.springjpa.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
