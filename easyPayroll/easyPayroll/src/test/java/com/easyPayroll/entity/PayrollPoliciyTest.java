package com.easyPayroll.entity;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.sql.Date;

public class PayrollPoliciyTest {

    @Test
    void testAllFieldsUsingConstructor() {
        Date effectiveDate = Date.valueOf("2024-06-01");
        PayrollPolicy policy = new PayrollPolicy(101, "Leave Policy", "Policy for annual leaves", effectiveDate, 1001);

        assertEquals(101, policy.getPolicyId());
        assertEquals("Leave Policy", policy.getPolicyName());
        assertEquals("Policy for annual leaves", policy.getDescription());
        assertEquals(effectiveDate, policy.getEffectiveFrom());
        assertEquals(1001, policy.getCreatedBy());
    }

    @Test
    void testSettersAndGetters() {
        PayrollPolicy policy = new PayrollPolicy();
        Date date = Date.valueOf("2025-01-01");

        policy.setPolicyId(202);
        policy.setPolicyName("Overtime Policy");
        policy.setDescription("Policy for overtime payments");
        policy.setEffectiveFrom(date);
        policy.setCreatedBy(2002);

        assertEquals(202, policy.getPolicyId());
        assertEquals("Overtime Policy", policy.getPolicyName());
        assertEquals("Policy for overtime payments", policy.getDescription());
        assertEquals(date, policy.getEffectiveFrom());
        assertEquals(2002, policy.getCreatedBy());
    }

    @Test
    void testToString() {
        Date date = Date.valueOf("2023-12-31");
        PayrollPolicy policy = new PayrollPolicy(303, "Salary Policy", "Monthly salary disbursement", date, 3003);

        String expected = "policyId: 303, policyName: Salary Policy, description: Monthly salary disbursement, effectiveFrom: 2023-12-31, createdBy: 3003";
        assertEquals(expected, policy.toString());
    }
}
