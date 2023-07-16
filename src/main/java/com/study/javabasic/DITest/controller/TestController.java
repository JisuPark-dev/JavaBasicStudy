package com.study.javabasic.DITest.controller;

import com.study.javabasic.DITest.service.DatabaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class TestController {
    private final DatabaseService databaseService;

    @GetMapping
    public String test() {
        databaseService.execute();
        return "ok";
    }
}

