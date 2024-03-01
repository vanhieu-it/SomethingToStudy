package com.hido.somethingtostudy.SOLID.D.src;

public class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        // Gửi tin nhắn qua email
        System.out.println("Sending email: " + message);
    }

    @Override
    public String receiveMessage() {
        // Nhận tin nhắn qua email
        return "Email message";
    }
}