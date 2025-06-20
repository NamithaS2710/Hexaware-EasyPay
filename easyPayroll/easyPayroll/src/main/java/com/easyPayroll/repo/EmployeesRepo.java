package com.easyPayroll.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.easyPayroll.entity.Employees;

public interface EmployeesRepo extends JpaRepository<Employees, Integer>{

}
