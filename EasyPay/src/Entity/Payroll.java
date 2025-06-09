package Entity;
import java.sql.Date;

public class Payroll {
	private int payrollId;
    private int employeeId;
    private Date payPeriodStart;
    private Date payPeriodEnd;
    private double grossSalary;
    private double deductions;
    private double netSalary;
    private String paymentStatus;
    private Date paymentDate;

    public Payroll() {}

    public Payroll(int payrollId, int employeeId, Date payPeriodStart, Date payPeriodEnd, double grossSalary, double deductions, double netSalary, String paymentStatus, Date paymentDate) {
        this.payrollId = payrollId;
        this.employeeId = employeeId;
        this.payPeriodStart = payPeriodStart;
        this.payPeriodEnd = payPeriodEnd;
        this.grossSalary = grossSalary;
        this.deductions = deductions;
        this.netSalary = netSalary;
        this.paymentStatus = paymentStatus;
        this.paymentDate = paymentDate;
    }

    public int getPayrollId() { return payrollId; }
    public void setPayrollId(int payrollId) { this.payrollId = payrollId; }
    public int getEmployeeId() { return employeeId; }
    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }
    public Date getPayPeriodStart() { return payPeriodStart; }
    public void setPayPeriodStart(Date payPeriodStart) { this.payPeriodStart = payPeriodStart; }
    public Date getPayPeriodEnd() { return payPeriodEnd; }
    public void setPayPeriodEnd(Date payPeriodEnd) { this.payPeriodEnd = payPeriodEnd; }
    public double getGrossSalary() { return grossSalary; }
    public void setGrossSalary(double grossSalary) { this.grossSalary = grossSalary; }
    public double getDeductions() { return deductions; }
    public void setDeductions(double deductions) { this.deductions = deductions; }
    public double getNetSalary() { return netSalary; }
    public void setNetSalary(double netSalary) { this.netSalary = netSalary; }
    public String getPaymentStatus() { return paymentStatus; }
    public void setPaymentStatus(String paymentStatus) { this.paymentStatus = paymentStatus; }
    public Date getPaymentDate() { return paymentDate; }
    public void setPaymentDate(Date paymentDate) { this.paymentDate = paymentDate; }

    @Override
    public String toString() {
        return "payrollId: " + payrollId +
               ", employeeId: " + employeeId +
               ", payPeriodStart: " + payPeriodStart +
               ", payPeriodEnd: " + payPeriodEnd +
               ", grossSalary: " + grossSalary +
               ", deductions: " + deductions +
               ", netSalary: " + netSalary +
               ", paymentStatus: " + paymentStatus +
               ", paymentDate: " + paymentDate;
    }

}
