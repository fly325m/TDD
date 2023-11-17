package com.example.dayonetest;

import org.junit.jupiter.api.Test;

class MyCaculatorTest {

    @Test
    void name() {
        MyCaculator myCaculator = new MyCaculator();
        myCaculator.add(10.0);
        myCaculator.add(10.0);
        myCaculator.divide(2.0);
        myCaculator.minus(2.0);
        myCaculator.divide(0.0);


        System.err.println(myCaculator.getResult());

    }
}