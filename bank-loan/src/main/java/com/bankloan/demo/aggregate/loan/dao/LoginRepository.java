package com.bankloan.demo.aggregate.loan.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankloan.demo.web.request.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, Integer> {

}
