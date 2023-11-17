package com.example.dayonetest;

public class MyCaculator {

    private Double result;

    public MyCaculator() {
        this.result = 0.0;
    }

    public MyCaculator(Double initResult) {
        this.result = initResult;
    }

    public MyCaculator add(Double number) {
        this.result += number;
        return this;
    }

    public MyCaculator minus(Double number) {
        this.result -= number;
        return this;
    }

    public MyCaculator multiply(Double number) {
        this.result *= number;
        return this;
    }

    public MyCaculator divide(Double number) {
        if (number == 0.0) {
            throw new ZeroDivisionException();
        }

        this.result /= number;
        return this;
    }

    public Double getResult() {
        return this.result;
    }


    public static class ZeroDivisionException extends RuntimeException {
    }

}
