package com.study.javabasic.DITest.v2.controller;

import com.study.javabasic.DITest.v2.service.DatabaseService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@RequiredArgsConstructor
public class TestControllerV2 {
    //final
    private DatabaseService databaseService;
    public TestControllerV2(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }


    @GetMapping("test/v2")
    public String test() {
        databaseService.execute();
        return "ok";
    }
}

