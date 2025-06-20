package com.easyPayroll.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.easyPayroll.entity.LeaveRequest;

public interface LeaveRequestRepo extends JpaRepository<LeaveRequest, Integer> {

}
