package com.easyPayroll.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.easyPayroll.entity.Payroll;

public interface PayrollRepo extends JpaRepository<Payroll, Integer>{

}
