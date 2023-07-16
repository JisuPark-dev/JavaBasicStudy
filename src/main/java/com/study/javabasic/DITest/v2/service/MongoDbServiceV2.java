package com.study.javabasic.DITest.v2.service;

import org.springframework.stereotype.Service;

@Service
public class MongoDbServiceV2 implements DatabaseService {
    @Override
    public void execute() {
        System.out.println("MongoDbService.execute");
    }
}
