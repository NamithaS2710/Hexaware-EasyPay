package com.easyPayroll.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.easyPayroll.entity.Users;

public interface UsersRepo extends JpaRepository<Users, Integer> {

}
