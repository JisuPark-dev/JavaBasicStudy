package com.study.javabasic.DITest.v1.controller;

import com.study.javabasic.DITest.v1.service.MysqlServiceV1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestControllerV1 {

//    private MongoDbServiceV1 mongoDbService = new MongoDbServiceV1();

    private MysqlServiceV1 mysqlServiceV1 = new MysqlServiceV1();
    @GetMapping("test/v1")
    public String test() {
        mysqlServiceV1.execute();
        return "ok";
    }
}

