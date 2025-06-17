package com.easyPayroll.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.easyPayroll.entity.PayrollPolicy;

public interface PayrollPolicyRepo extends JpaRepository<PayrollPolicy, Integer>{

}
