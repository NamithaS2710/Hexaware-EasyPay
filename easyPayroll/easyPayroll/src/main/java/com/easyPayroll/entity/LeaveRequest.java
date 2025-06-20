package com.easyPayroll.entity;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class LeaveRequest {
	@Id
	private int leaveId;
    private int employeeId;
    private Date startDate;
    private Date endDate;
    private String reason;
    private String status;
    private int approvedBy;

    public LeaveRequest() {}

    public LeaveRequest(int leaveId, int employeeId, Date startDate, Date endDate, String reason, String status, int approvedBy) {
        this.leaveId = leaveId;
        this.employeeId = employeeId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.reason = reason;
        this.status = status;
        this.approvedBy = approvedBy;
    }

    public int getLeaveId() {
		return leaveId;
	}

	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getApprovedBy() {
		return approvedBy;
	}

	public void setApprovedBy(int approvedBy) {
		this.approvedBy = approvedBy;
	}

	@Override
    public String toString() {
        return "leaveId: " + leaveId +
               ", employeeId: " + employeeId +
               ", startDate: " + startDate +
               ", endDate: " + endDate +
               ", reason: " + reason +
               ", status: " + status +
               ", approvedBy: " + approvedBy;
    }

}
