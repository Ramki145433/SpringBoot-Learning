package com.example.learningSpringBoot.DBConnections;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(
        prefix = "sqlConnection",
        value = "nosql",
        havingValue = "true",
        matchIfMissing = false)
public class NosqlConnection {
    public NosqlConnection() {
        System.out.println("NoSQL Connection Initiated");
    }
}
