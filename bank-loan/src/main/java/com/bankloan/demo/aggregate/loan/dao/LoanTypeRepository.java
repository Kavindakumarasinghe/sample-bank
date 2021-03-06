package com.bankloan.demo.aggregate.loan.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankloan.demo.aggregate.loan.projection.LoanType;

@Repository
public interface LoanTypeRepository extends JpaRepository<LoanType, Integer> {

}
