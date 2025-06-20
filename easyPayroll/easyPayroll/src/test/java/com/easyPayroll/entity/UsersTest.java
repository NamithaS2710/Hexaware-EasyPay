package com.easyPayroll.entity;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UsersTest {

    @Test
    void testAllFieldsUsingConstructor() {
        Users user = new Users(1, "nami", "abc", "employee", "abc@mail.com", true);

        assertEquals(1, user.getUserId());
        assertEquals("nami", user.getUsername());
        assertEquals("abc", user.getPasswordHash());
        assertEquals("employee", user.getRole());
        assertEquals("abc@mail.com", user.getEmail());
        assertTrue(user.isActive());
    }

    @Test
    void testSettersAndGetters() {
        Users user = new Users();

        user.setUserId(1);
        user.setUsername("nami");
        user.setPasswordHash("abc");
        user.setRole("employee");
        user.setEmail("abc@mail.com");
        user.setActive(false);

        assertEquals(1, user.getUserId());
        assertEquals("nami", user.getUsername());
        assertEquals("abc", user.getPasswordHash());
        assertEquals("employee", user.getRole());
        assertEquals("abc@mail.com", user.getEmail());
        assertFalse(user.isActive());
    }

    @Test
    void testToString() {
        Users user = new Users(1, "nami", "abc", "employee", "abc@mail.com", true);
        String expected = "userId: 1, username: nami, passwordHash: abc, role: employee, email: abc@mail.com, isActive: true";
        assertEquals(expected, user.toString());
    }
}
