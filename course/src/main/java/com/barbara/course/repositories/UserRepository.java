package com.barbara.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barbara.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
