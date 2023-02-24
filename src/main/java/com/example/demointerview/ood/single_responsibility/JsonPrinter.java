package com.example.demointerview.ood.single_responsibility;

import lombok.extern.slf4j.Slf4j;

@Slf4j(topic = "JsonPrinter")
public class JsonPrinter<T> implements IPrinter<T> {

    @Override
    public void print(T object) {
        log.info(object.toString());
    }
}
