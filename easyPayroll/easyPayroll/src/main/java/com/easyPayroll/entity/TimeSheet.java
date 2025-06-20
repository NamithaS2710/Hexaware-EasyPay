package com.easyPayroll.entity;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class TimeSheet {
	@Id
	private int timesheetId;
    private int employeeId;
    private Date workDate;
    private double hoursWorked;
    private String taskDescription;
    private Date submittedOn;

    public TimeSheet() {}

    public TimeSheet(int timesheetId, int employeeId, Date workDate, double hoursWorked, String taskDescription, Date submittedOn) {
        this.timesheetId = timesheetId;
        this.employeeId = employeeId;
        this.workDate = workDate;
        this.hoursWorked = hoursWorked;
        this.taskDescription = taskDescription;
        this.submittedOn = submittedOn;
    }

    
    public int getTimesheetId() {
		return timesheetId;
	}

	public void setTimesheetId(int timesheetId) {
		this.timesheetId = timesheetId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public Date getWorkDate() {
		return workDate;
	}

	public void setWorkDate(Date workDate) {
		this.workDate = workDate;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	public Date getSubmittedOn() {
		return submittedOn;
	}

	public void setSubmittedOn(Date submittedOn) {
		this.submittedOn = submittedOn;
	}

	@Override
    public String toString() {
        return "timesheetId: " + timesheetId +
               ", employeeId: " + employeeId +
               ", workDate: " + workDate +
               ", hoursWorked: " + hoursWorked +
               ", taskDescription: " + taskDescription +
               ", submittedOn: " + submittedOn;
    }

}
