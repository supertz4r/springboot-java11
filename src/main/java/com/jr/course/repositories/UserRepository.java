package com.jr.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jr.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
}
