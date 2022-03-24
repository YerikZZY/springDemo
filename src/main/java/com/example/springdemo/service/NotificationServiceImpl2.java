package com.example.springdemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class NotificationServiceImpl2 implements NotificationService {
    @Override
    public void sendNotification(String s) {
        System.out.println("Email is sent with content. " + s);

    }
}
