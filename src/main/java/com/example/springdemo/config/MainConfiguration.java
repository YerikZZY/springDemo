package com.example.springdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfiguration {
    @Bean
    public String getTemplate(){
        return "Hello welcome";
    }
}
