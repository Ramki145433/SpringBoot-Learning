package com.example.learningSpringBoot.Config;

import jakarta.servlet.ServletRegistration;
import org.h2.server.web.JakartaWebServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class H2Config {

    @Bean
    public ServletRegistrationBean<JakartaWebServlet> h2ServletRegistration() {
        ServletRegistrationBean<JakartaWebServlet> registration =
                new ServletRegistrationBean<>(new JakartaWebServlet());

        registration.addUrlMappings("/h2-console/*");
        return registration;
    }
}