package com.chris.express.manage.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController1 {
    @RequestMapping("/test1")
    public String test() {
        return "test";
    }
}
