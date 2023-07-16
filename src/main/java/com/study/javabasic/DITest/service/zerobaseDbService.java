package com.study.javabasic.DITest.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class zerobaseDbService implements DatabaseService{
    @Override
    public void execute() {
        System.out.println("zerobaseDbService.execute");
    }
}
