package com.example.learningSpringBoot.DBConnections;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(
        prefix = "sqlConnection",
        value = "mysql",
        havingValue = "true",
        matchIfMissing = false)
public class MysqlConnection {
    public MysqlConnection() {
        System.out.println("MySQl Connection Initiated");
    }
}
