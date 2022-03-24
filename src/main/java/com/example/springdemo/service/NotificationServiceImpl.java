package com.example.springdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationServiceImpl implements NotificationService {

    @Autowired
    String template;

    @Override
    public void sendNotification(String s) {
        System.out.println("Notification sent " + template);
    }
}
