package com.bankloan.demo.aggregate.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankloan.demo.aggregate.user.projection.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
