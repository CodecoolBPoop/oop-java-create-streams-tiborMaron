package com.codecool;

import java.util.function.Supplier;

public class Fibonacci implements Supplier<Integer> {
    private Integer n = 0;
    private Integer F = 1;
    private Integer previousF = 0;

    @Override
    public Integer get() {
        if (n.equals(0)) {
            n++;
            return 0;
        } else {
            n++;
            Integer result = F + previousF;
            previousF = F;
            F = result;
            return result;
        }
    }
}
