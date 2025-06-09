package Entity;
import java.sql.Date;

public class Notification {
	private int notificationId;
    private int userId;
    private String message;
    private boolean isRead;
    private Date createdAt;

    public Notification() {}

    public Notification(int notificationId, int userId, String message, boolean isRead, Date createdAt) {
        this.notificationId = notificationId;
        this.userId = userId;
        this.message = message;
        this.isRead = isRead;
        this.createdAt = createdAt;
    }

    public int getNotificationId() { return notificationId; }
    public void setNotificationId(int notificationId) { this.notificationId = notificationId; }
    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
    public boolean isRead() { return isRead; }
    public void setRead(boolean isRead) { this.isRead = isRead; }
    public Date getCreatedAt() { return createdAt; }
    public void setCreatedAt(Date createdAt) { this.createdAt = createdAt; }

    @Override
    public String toString() {
        return "notificationId: " + notificationId +
               ", userId: " + userId +
               ", message: " + message +
               ", isRead: " + isRead +
               ", createdAt: " + createdAt;
    }

}
