package com.easyPayroll.entity;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.sql.Date;

public class LeaveRequestTest {

    @Test
    void testAllFieldsUsingConstructor() {
        Date start = Date.valueOf("2024-07-01");
        Date end = Date.valueOf("2024-07-05");
        LeaveRequest leave = new LeaveRequest(1, 101, start, end, "Medical", "Pending", 5001);

        assertEquals(1, leave.getLeaveId());
        assertEquals(101, leave.getEmployeeId());
        assertEquals(start, leave.getStartDate());
        assertEquals(end, leave.getEndDate());
        assertEquals("Medical", leave.getReason());
        assertEquals("Pending", leave.getStatus());
        assertEquals(5001, leave.getApprovedBy());
    }

    @Test
    void testSettersAndGetters() {
        LeaveRequest leave = new LeaveRequest();
        Date start = Date.valueOf("2024-08-10");
        Date end = Date.valueOf("2024-08-12");

        leave.setLeaveId(2);
        leave.setEmployeeId(202);
        leave.setStartDate(start);
        leave.setEndDate(end);
        leave.setReason("Vacation");
        leave.setStatus("Approved");
        leave.setApprovedBy(6001);

        assertEquals(2, leave.getLeaveId());
        assertEquals(202, leave.getEmployeeId());
        assertEquals(start, leave.getStartDate());
        assertEquals(end, leave.getEndDate());
        assertEquals("Vacation", leave.getReason());
        assertEquals("Approved", leave.getStatus());
        assertEquals(6001, leave.getApprovedBy());
    }

    @Test
    void testToString() {
        Date start = Date.valueOf("2024-09-15");
        Date end = Date.valueOf("2024-09-20");
        LeaveRequest leave = new LeaveRequest(3, 303, start, end, "Emergency", "Rejected", 7001);

        String expected = "leaveId: 3, employeeId: 303, startDate: 2024-09-15, endDate: 2024-09-20, reason: Emergency, status: Rejected, approvedBy: 7001";
        assertEquals(expected, leave.toString());
    }
}
