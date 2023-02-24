package com.example.demointerview.ood.single_responsibility;

public class MainTest {
    public static void main(String[] args) {
        JsonPrinter<Circle> jsonPrinter = new JsonPrinter<>();

        Circle circle = Circle.builder()
                .radius(10)
                .build();

        jsonPrinter.print(circle);
    }
}
