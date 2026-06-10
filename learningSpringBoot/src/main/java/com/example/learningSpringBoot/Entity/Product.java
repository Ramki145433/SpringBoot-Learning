package com.example.learningSpringBoot.Entity;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Product {
    public Product() {
        System.out.println("Product Constructor");
    }

    @PostConstruct
    public void productInit() {
        System.out.println("Product Initiated " + this.hashCode());
    }
}
