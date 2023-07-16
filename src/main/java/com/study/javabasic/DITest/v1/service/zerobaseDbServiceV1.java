package com.study.javabasic.DITest.v1.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class zerobaseDbServiceV1 {

    public void execute() {
        System.out.println("zerobaseDbService.execute");
    }
}
