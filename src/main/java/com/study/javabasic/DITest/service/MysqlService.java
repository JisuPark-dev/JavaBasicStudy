package com.study.javabasic.DITest.service;

import org.springframework.stereotype.Service;

@Service
public class MysqlService implements DatabaseService{
    @Override
    public void execute() {
        System.out.println("MysqlService.execute");
    }
}
