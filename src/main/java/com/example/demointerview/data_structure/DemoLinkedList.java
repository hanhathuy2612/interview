package com.example.demointerview.data_structure;

import lombok.extern.slf4j.Slf4j;

import java.util.Comparator;
import java.util.LinkedList;

@Slf4j
public class DemoLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(7);
        list.add(5);
        list.add(1);
        list.add(9);
        log.info("LinkedList: {}", String.join(
                ", ",
                list.stream().map(Object::toString).toList())
        );
        log.info("First Element is {}", list.getFirst());
        log.info("Last Element is {}", list.getLast());

        list.addFirst(12);
        list.addLast(10);

        log.info("LinkedList: {}", String.join(
                ", ",
                list.stream().map(Object::toString).toList())
        );
        log.info("First Element is {}", list.getFirst());
        log.info("Last Element is {}", list.getLast());

        log.info(
                "LinkedList is Sorted: {}",
                String.join(", ",
                        list.stream().sorted(Comparator.comparingInt(o -> o)).map(Object::toString).toList()
                )
        );
    }
}
