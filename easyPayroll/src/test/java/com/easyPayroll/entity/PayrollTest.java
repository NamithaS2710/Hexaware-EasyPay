package com.easyPayroll.entity;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.sql.Date;

public class PayrollTest {

    @Test
    void testAllFieldsUsingConstructor() {
        Date start = Date.valueOf("2024-06-01");
        Date end = Date.valueOf("2024-06-30");
        Date paymentDate = Date.valueOf("2024-07-05");

        Payroll payroll = new Payroll(1, 101, start, end, 50000.0, 5000.0, 45000.0, "Paid", paymentDate);

        assertEquals(1, payroll.getPayrollId());
        assertEquals(101, payroll.getEmployeeId());
        assertEquals(start, payroll.getPayPeriodStart());
        assertEquals(end, payroll.getPayPeriodEnd());
        assertEquals(50000.0, payroll.getGrossSalary());
        assertEquals(5000.0, payroll.getDeductions());
        assertEquals(45000.0, payroll.getNetSalary());
        assertEquals("Paid", payroll.getPaymentStatus());
        assertEquals(paymentDate, payroll.getPaymentDate());
    }

    @Test
    void testSettersAndGetters() {
        Payroll payroll = new Payroll();
        Date start = Date.valueOf("2025-01-01");
        Date end = Date.valueOf("2025-01-31");
        Date paymentDate = Date.valueOf("2025-02-05");

        payroll.setPayrollId(2);
        payroll.setEmployeeId(202);
        payroll.setPayPeriodStart(start);
        payroll.setPayPeriodEnd(end);
        payroll.setGrossSalary(60000.0);
        payroll.setDeductions(6000.0);
        payroll.setNetSalary(54000.0);
        payroll.setPaymentStatus("Pending");
        payroll.setPaymentDate(paymentDate);

        assertEquals(2, payroll.getPayrollId());
        assertEquals(202, payroll.getEmployeeId());
        assertEquals(start, payroll.getPayPeriodStart());
        assertEquals(end, payroll.getPayPeriodEnd());
        assertEquals(60000.0, payroll.getGrossSalary());
        assertEquals(6000.0, payroll.getDeductions());
        assertEquals(54000.0, payroll.getNetSalary());
        assertEquals("Pending", payroll.getPaymentStatus());
        assertEquals(paymentDate, payroll.getPaymentDate());
    }

    @Test
    void testToString() {
        Date start = Date.valueOf("2024-04-01");
        Date end = Date.valueOf("2024-04-30");
        Date payDate = Date.valueOf("2024-05-05");

        Payroll payroll = new Payroll(3, 303, start, end, 70000.0, 7000.0, 63000.0, "Paid", payDate);

        String expected = "payrollId: 3, employeeId: 303, payPeriodStart: 2024-04-01, payPeriodEnd: 2024-04-30, grossSalary: 70000.0, deductions: 7000.0, netSalary: 63000.0, paymentStatus: Paid, paymentDate: 2024-05-05";
        assertEquals(expected, payroll.toString());
    }
}
