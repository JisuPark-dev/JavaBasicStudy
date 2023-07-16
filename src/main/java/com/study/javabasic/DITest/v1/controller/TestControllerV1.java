package com.study.javabasic.DITest.v1.controller;

import com.study.javabasic.DITest.v1.service.MongoDbServiceV1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestControllerV1 {

    private MongoDbServiceV1 mongoDbService = new MongoDbServiceV1();

    @GetMapping("test/v1")
    public String test() {
        mongoDbService.execute();
        return "ok";
    }
}

