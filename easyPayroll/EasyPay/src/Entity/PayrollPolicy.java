package Entity;
import java.sql.Date;

public class PayrollPolicy {
	private int policyId;
    private String policyName;
    private String description;
    private Date effectiveFrom;
    private int createdBy;

    public PayrollPolicy() {}

    public PayrollPolicy(int policyId, String policyName, String description, Date effectiveFrom, int createdBy) {
        this.policyId = policyId;
        this.policyName = policyName;
        this.description = description;
        this.effectiveFrom = effectiveFrom;
        this.createdBy = createdBy;
    }

    public int getPolicyId() { return policyId; }
    public void setPolicyId(int policyId) { this.policyId = policyId; }
    public String getPolicyName() { return policyName; }
    public void setPolicyName(String policyName) { this.policyName = policyName; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public Date getEffectiveFrom() { return effectiveFrom; }
    public void setEffectiveFrom(Date effectiveFrom) { this.effectiveFrom = effectiveFrom; }
    public int getCreatedBy() { return createdBy; }
    public void setCreatedBy(int createdBy) { this.createdBy = createdBy; }

    @Override
    public String toString() {
        return "policyId: " + policyId +
               ", policyName: " + policyName +
               ", description: " + description +
               ", effectiveFrom: " + effectiveFrom +
               ", createdBy: " + createdBy;
    }

}
