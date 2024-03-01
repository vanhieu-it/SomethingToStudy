package com.hido.somethingtostudy.SOLID.D.src;

public class NotificationService {
    private MessageService messageService;

    public NotificationService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void notifyUser(String message) {
        // Gửi thông báo bằng cách sử dụng messageService
        messageService.sendMessage(message);
    }
    // lớp NotificationService sử dụng MessageService như là một dependency.
    // Tuy nhiên, chúng ta không trực tiếp liên kết với các lớp cụ thể EmailService hoặc SMSService,
    // mà thay vào đó chúng ta sử dụng giao diện MessageService, tuân theo nguyên lý Dependency Inversion Principle
    // lớp NotificationService không phụ thuộc trực tiếp vào các lớp cụ thể EmailService hoặc SMSService,
    // mà thay vào đó nó phụ thuộc vào giao diện MessageService.
    // Điều này làm cho mã linh hoạt hơn và dễ dàng mở rộng và thay đổi trong tương lai mà không cần phải thay đổi lớp NotificationService.
}
