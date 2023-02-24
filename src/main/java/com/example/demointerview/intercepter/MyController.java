package com.example.demointerview.intercepter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test/interceptor")
@Logging
public class MyController {
    @GetMapping("test")
    public String test() {
        return "How do you feel today?";
    }
}
