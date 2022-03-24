package com.example.springdemo.service;

import com.example.springdemo.aop.TimeUsed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service // @Component, @controller, @Repository

public class CustomerService {

    @Autowired // field injection
    @Qualifier("notificationServiceImpl")
    private NotificationService notificationService;

//    @Autowired // constructor injection
//    public CustomerService(NotificationService notificationService) {
//        this.notificationService = notificationService;
//    }
//
//    @Autowired // setter injection
//    public void setNotificationService(NotificationService notificationService) {
//        this.notificationService = notificationService;
//    }

    @TimeUsed
    public void register(){
        notificationService.sendNotification("Congrats, you registered successfully");
    }
}
