package com.easyPayroll.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.easyPayroll.entity.AuditTrail;



public interface AuditTrailRepo extends JpaRepository<AuditTrail, Integer>{
	

}
