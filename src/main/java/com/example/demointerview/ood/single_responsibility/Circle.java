package com.example.demointerview.ood.single_responsibility;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
public class Circle implements IShape {
    private static final double PI = 3.14;
    private int radius;

    @Override
    public double acreage() {
        return radius * PI;
    }
}
