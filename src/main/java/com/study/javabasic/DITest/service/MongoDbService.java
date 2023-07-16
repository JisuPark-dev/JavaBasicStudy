package com.study.javabasic.DITest.service;

import org.springframework.stereotype.Service;

@Service
public class MongoDbService implements DatabaseService {
    @Override
    public void execute() {
        System.out.println("MongoDbService.execute");
    }
}
