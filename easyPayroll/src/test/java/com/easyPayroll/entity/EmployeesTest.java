package com.easyPayroll.entity;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.sql.Date;

public class EmployeesTest {

    @Test
    void testAllFieldsUsingConstructor() {
        Date doj = Date.valueOf("2023-05-10");
        Employees emp = new Employees(1, 101, "Nami", "S", "HR", "Manager", doj, "Active", "9876543210");

        assertEquals(1, emp.getEmployeeId());
        assertEquals(101, emp.getUserId());
        assertEquals("Nami", emp.getFirstName());
        assertEquals("S", emp.getLastName());
        assertEquals("HR", emp.getDepartment());
        assertEquals("Manager", emp.getDesignation());
        assertEquals(doj, emp.getDateOfJoining());
        assertEquals("Active", emp.getStatus());
        assertEquals("9876543210", emp.getContactNumber());
    }

    @Test
    void testSettersAndGetters() {
        Employees emp = new Employees();
        Date doj = Date.valueOf("2024-01-01");

        emp.setEmployeeId(2);
        emp.setUserId(202);
        emp.setFirstName("John");
        emp.setLastName("Doe");
        emp.setDepartment("IT");
        emp.setDesignation("Developer");
        emp.setDateOfJoining(doj);
        emp.setStatus("Inactive");
        emp.setContactNumber("9123456789");

        assertEquals(2, emp.getEmployeeId());
        assertEquals(202, emp.getUserId());
        assertEquals("John", emp.getFirstName());
        assertEquals("Doe", emp.getLastName());
        assertEquals("IT", emp.getDepartment());
        assertEquals("Developer", emp.getDesignation());
        assertEquals(doj, emp.getDateOfJoining());
        assertEquals("Inactive", emp.getStatus());
        assertEquals("9123456789", emp.getContactNumber());
    }

    @Test
    void testToString() {
        Date doj = Date.valueOf("2023-12-12");
        Employees emp = new Employees(3, 303, "Alice", "Smith", "Finance", "Analyst", doj, "Active", "9000011111");

        String expected = "employeeId: 3, userId: 303, firstName: Alice, lastName: Smith, department: Finance, designation: Analyst, dateOfJoining: 2023-12-12, status: Active, contactNumber: 9000011111";
        assertEquals(expected, emp.toString());
    }
}
