package com.easyPayroll.entity;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.sql.Date;

public class AuditTrailTest {

    @Test
    void testAllFieldsUsingConstructor() {
        Date actionDate = Date.valueOf("2024-06-16");
        AuditTrail audit = new AuditTrail(1, 101, "LOGIN", "AUTH", actionDate);

        assertEquals(1, audit.getLogId());
        assertEquals(101, audit.getUserId());
        assertEquals("LOGIN", audit.getAction());
        assertEquals("AUTH", audit.getModule());
        assertEquals(actionDate, audit.getActionTime());
    }

    @Test
    void testSettersAndGetters() {
        AuditTrail audit = new AuditTrail();
        Date actionDate = Date.valueOf("2024-06-16");

        audit.setLogId(2);
        audit.setUserId(102);
        audit.setAction("LOGOUT");
        audit.setModule("SESSION");
        audit.setActionTime(actionDate);

        assertEquals(2, audit.getLogId());
        assertEquals(102, audit.getUserId());
        assertEquals("LOGOUT", audit.getAction());
        assertEquals("SESSION", audit.getModule());
        assertEquals(actionDate, audit.getActionTime());
    }

    @Test
    void testToString() {
        Date actionDate = Date.valueOf("2024-06-16");
        AuditTrail audit = new AuditTrail(3, 103, "UPDATE", "EMPLOYEE", actionDate);
        String expected = "logId: 3, userId: 103, action: UPDATE, module: EMPLOYEE, actionTime: 2024-06-16";
        assertEquals(expected, audit.toString());
    }
}
