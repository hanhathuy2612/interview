package com.example.demointerview.data_structure;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class DemoArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        log.info("Origin List");
        list.forEach(a -> log.info("{}", a));

        log.info("Sorted List");
        list.sort((o1, o2) -> o2 - o1);
        list.forEach(a -> log.info("{}", a));
    }
}
