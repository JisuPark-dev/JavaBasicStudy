package com.study.javabasic.DITest.v3.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Service
@Component
@Primary
public class MysqlServiceV3 implements DatabaseServiceV3 {
    @Override
    public void execute() {
        System.out.println("MysqlService.execute");
    }
}
