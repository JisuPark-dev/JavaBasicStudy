package com.study.javabasic.DITest.v2.service;

import org.springframework.stereotype.Service;

@Service
//@Component
public class MongoDbServiceV2 implements DatabaseServiceV2  {

    @Override
    public void execute() {
        System.out.println("MongoDbServiceV2.execute");
    }
}
