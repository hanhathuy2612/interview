package com.example.demointerview.ood.single_responsibility;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
public class Rectangle implements IShape {
    private double edge;

    @Override
    public double acreage() {
        return edge * edge;
    }
}
