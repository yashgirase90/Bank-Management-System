package com.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
