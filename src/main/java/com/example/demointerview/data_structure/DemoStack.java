package com.example.demointerview.data_structure;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class DemoStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Huy");
        stack.push("Ha");
        stack.push("Nhat");

        logList(stack);
        log.info("Pop: {}", stack.pop());
        logList(stack);
        log.info("Peek: {}", stack.peek()); // only get first
        logList(stack);
        log.info("Pop again: {}", stack.pop()); // get first and remove it out of stack
        logList(stack);
        log.info("Pop again: {}", stack.pop());
        logList(stack);
    }

    static void logList(List<String> stack) {
        log.info("Stack: {}", stack);
    }
}
