package com.study.javabasic.DITest.v2.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class zerobaseDbServiceV2 implements DatabaseService{
    @Override
    public void execute() {
        System.out.println("zerobaseDbService.execute");
    }
}
