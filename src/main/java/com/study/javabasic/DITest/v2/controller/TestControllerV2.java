package com.study.javabasic.DITest.v2.controller;

import com.study.javabasic.DITest.v2.service.DatabaseServiceV2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@RequiredArgsConstructor
public class TestControllerV2 {
    //final
    private DatabaseServiceV2 databaseServiceV2;
    public TestControllerV2(DatabaseServiceV2 databaseServiceV2) {
        this.databaseServiceV2 = databaseServiceV2;
    }


    @GetMapping("test/v2")
    public String test() {
        databaseServiceV2.execute();
        return "ok";
    }
}

