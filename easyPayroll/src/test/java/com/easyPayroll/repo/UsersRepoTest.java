package com.easyPayroll.repo;

import com.easyPayroll.entity.Users;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UsersRepoTest {

	@Autowired
	private UsersRepo usersRepo;

	@Test
	void testUsersRepoIsNotNull() {
		assertNotNull(usersRepo, "UsersRepo should not be null");
	}
}