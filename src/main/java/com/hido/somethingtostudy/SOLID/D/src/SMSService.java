package com.hido.somethingtostudy.SOLID.D.src;

public class SMSService implements MessageService {
    @Override
    public void sendMessage(String message) {
        // Gửi tin nhắn qua SMS
        System.out.println("Sending SMS: " + message);
    }

    @Override
    public String receiveMessage() {
        // Nhận tin nhắn qua SMS
        return "SMS message";
    }
}
