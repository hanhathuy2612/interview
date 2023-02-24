package com.example.demointerview.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@MyAnnotation(name = "huyawdw")
@Component
public class MyBean {

    public void sendName() {
        log.info("name");
    }
}
