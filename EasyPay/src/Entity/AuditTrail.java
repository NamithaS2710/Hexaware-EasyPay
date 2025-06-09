package Entity;
import java.sql.Date;

public class AuditTrail {
	    private int logId;
	    private int userId;
	    private String action;
	    private String module;
	    private Date actionTime;

	    public AuditTrail() {}

	    public AuditTrail(int logId, int userId, String action, String module, Date actionTime) {
	        this.logId = logId;
	        this.userId = userId;
	        this.action = action;
	        this.module = module;
	        this.actionTime = actionTime;
	    }

	    public int getLogId() { return logId; }
	    public void setLogId(int logId) { this.logId = logId; }
	    public int getUserId() { return userId; }
	    public void setUserId(int userId) { this.userId = userId; }
	    public String getAction() { return action; }
	    public void setAction(String action) { this.action = action; }
	    public String getModule() { return module; }
	    public void setModule(String module) { this.module = module; }
	    public Date getActionTime() { return actionTime; }
	    public void setActionTime(Date actionTime) { this.actionTime = actionTime; }

	    @Override
	    public String toString() {
	        return "logId: " + logId +
	               ", userId: " + userId +
	               ", action: " + action +
	               ", module: " + module +
	               ", actionTime: " + actionTime;
	    }

}
