package com.example.demointerview.data_structure;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayDeque;
import java.util.Queue;

@Slf4j
public class DemoQueue {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");
        queue.add("E");
        queue.add("F");

        logList(queue);

        log.info("Poll: {}", queue.poll());
        logList(queue);

        log.info("Peek: {}", queue.peek());
        logList(queue);

        log.info("Element: {}", queue.element());
        logList(queue);
    }

    static void logList(Queue<String> queue) {
        log.info("Queue: {}", queue);
    }

}
