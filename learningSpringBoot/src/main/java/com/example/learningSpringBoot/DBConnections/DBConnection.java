package com.example.learningSpringBoot.DBConnections;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DBConnection {
    @Autowired(required = false)
    MysqlConnection mysqlConnection;

    @Autowired(required = false)
    NosqlConnection nosqlConnection;

    @PostConstruct
    public void DBConnection(){
        System.out.println("DB Connection Initiated");
        System.out.println("Mysql Connection : " + mysqlConnection);
        System.out.println("Nosql Connection : " + nosqlConnection);
    }
}
