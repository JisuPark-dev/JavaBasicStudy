package com.study.javabasic.DITest.v3.service;

import org.springframework.stereotype.Component;

//@Service
@Component
public class MongoDbServiceV3 implements DatabaseServiceV3 {
    @Override
    public void execute() {
        System.out.println("MongoDbService.execute");
    }
}
