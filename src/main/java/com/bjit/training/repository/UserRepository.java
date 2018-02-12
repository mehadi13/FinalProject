package com.bjit.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bjit.training.model.User;



public interface UserRepository extends JpaRepository<User, Integer>  {

}
