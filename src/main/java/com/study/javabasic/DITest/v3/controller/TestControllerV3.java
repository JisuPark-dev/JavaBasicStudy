package com.study.javabasic.DITest.v3.controller;

import com.study.javabasic.DITest.v3.service.DatabaseServiceV3;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@RequiredArgsConstructor
public class TestControllerV3 {
    //final
    private DatabaseServiceV3 databaseServiceV3;
    public TestControllerV3(DatabaseServiceV3 databaseServiceV3) {
        this.databaseServiceV3 = databaseServiceV3;
    }


    @GetMapping("test/v3")
    public String test() {
        databaseServiceV3.execute();
        return "ok";
    }
}

