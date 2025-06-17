package com.easyPayroll.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.easyPayroll.entity.TimeSheet;

public interface TimeSheetRepo extends JpaRepository<TimeSheet, Integer>{

}
