package com.easyPayroll.entity;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.sql.Date;

public class NotificationTest {

    @Test
    void testAllFieldsUsingConstructor() {
        Date createdAt = Date.valueOf("2024-06-01");
        Notification notification = new Notification(1, 101, "New message", false, createdAt);

        assertEquals(1, notification.getNotificationId());
        assertEquals(101, notification.getUserId());
        assertEquals("New message", notification.getMessage());
        assertFalse(notification.isRead());
        assertEquals(createdAt, notification.getCreatedAt());
    }

    @Test
    void testSettersAndGetters() {
        Notification notification = new Notification();
        Date date = Date.valueOf("2024-07-15");

        notification.setNotificationId(2);
        notification.setUserId(202);
        notification.setMessage("Welcome!");
        notification.setRead(true);
        notification.setCreatedAt(date);

        assertEquals(2, notification.getNotificationId());
        assertEquals(202, notification.getUserId());
        assertEquals("Welcome!", notification.getMessage());
        assertTrue(notification.isRead());
        assertEquals(date, notification.getCreatedAt());
    }

    @Test
    void testToString() {
        Date createdAt = Date.valueOf("2024-08-10");
        Notification notification = new Notification(3, 303, "Alert triggered", true, createdAt);

        String expected = "notificationId: 3, userId: 303, message: Alert triggered, isRead: true, createdAt: 2024-08-10";
        assertEquals(expected, notification.toString());
    }
}
