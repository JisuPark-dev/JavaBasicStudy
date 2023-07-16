package com.study.javabasic.DITest.v2.service;

import org.springframework.stereotype.Service;

@Service
public class MysqlServiceV2 implements DatabaseService{
    @Override
    public void execute() {
        System.out.println("MysqlService.execute");
    }
}
