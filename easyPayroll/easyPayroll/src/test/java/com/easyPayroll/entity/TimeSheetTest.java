package com.easyPayroll.entity;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.sql.Date;

public class TimeSheetTest {

    @Test
    void testAllFieldsUsingConstructor() {
        Date workDate = Date.valueOf("2024-06-10");
        Date submittedOn = Date.valueOf("2024-06-11");

        TimeSheet timesheet = new TimeSheet(1, 101, workDate, 8.5, "Developed payroll feature", submittedOn);

        assertEquals(1, timesheet.getTimesheetId());
        assertEquals(101, timesheet.getEmployeeId());
        assertEquals(workDate, timesheet.getWorkDate());
        assertEquals(8.5, timesheet.getHoursWorked());
        assertEquals("Developed payroll feature", timesheet.getTaskDescription());
        assertEquals(submittedOn, timesheet.getSubmittedOn());
    }

    @Test
    void testSettersAndGetters() {
        TimeSheet timesheet = new TimeSheet();
        Date workDate = Date.valueOf("2025-01-15");
        Date submittedOn = Date.valueOf("2025-01-16");

        timesheet.setTimesheetId(2);
        timesheet.setEmployeeId(202);
        timesheet.setWorkDate(workDate);
        timesheet.setHoursWorked(7.25);
        timesheet.setTaskDescription("Fixed bugs in UI module");
        timesheet.setSubmittedOn(submittedOn);

        assertEquals(2, timesheet.getTimesheetId());
        assertEquals(202, timesheet.getEmployeeId());
        assertEquals(workDate, timesheet.getWorkDate());
        assertEquals(7.25, timesheet.getHoursWorked());
        assertEquals("Fixed bugs in UI module", timesheet.getTaskDescription());
        assertEquals(submittedOn, timesheet.getSubmittedOn());
    }

    @Test
    void testToString() {
        Date workDate = Date.valueOf("2024-05-20");
        Date submittedOn = Date.valueOf("2024-05-21");

        TimeSheet timesheet = new TimeSheet(3, 303, workDate, 6.0, "Code review", submittedOn);

        String expected = "timesheetId: 3, employeeId: 303, workDate: 2024-05-20, hoursWorked: 6.0, taskDescription: Code review, submittedOn: 2024-05-21";
        assertEquals(expected, timesheet.toString());
    }
}

