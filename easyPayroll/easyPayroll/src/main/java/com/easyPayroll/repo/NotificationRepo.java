package com.easyPayroll.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.easyPayroll.entity.Notification;

public interface NotificationRepo extends JpaRepository<Notification, Integer>{

}
