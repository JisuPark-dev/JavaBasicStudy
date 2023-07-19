package com.study.javabasic.DITest.v2.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Service
@Component
@Primary
public class MysqlServiceV2  implements DatabaseServiceV2{

    @Override
    public void execute() {
        System.out.println("MysqlServiceV2.execute");
    }
}
