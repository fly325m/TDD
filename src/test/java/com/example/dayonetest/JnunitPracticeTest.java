package com.example.dayonetest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class JnunitPracticeTest {


    @Test
    void name() {

        String expect = "eve";
        String actual = "eve";

        Assertions.assertEquals(expect, actual);

    }

    @Test
    void assertNotEqualsTest() {

        String expect = "eve";
        String actual = "ev1";

        Assertions.assertNotEquals(expect, actual);
    }

    @Test
    void assertTrue() {

        Boolean aaa = true;

        Assertions.assertTrue(aaa);

    }

    @Test
    void assertFalse() {

        Integer a = 10;
        Integer b = 20;

        Assertions.assertThrows(RuntimeException.class, ()->{
            throw new RuntimeException();
        });

    }

    @Test
    void assertNotNullTest() {

        String value = "Hello";

        Assertions.assertNotNull(value);

    }

    @Test
    void assertNullTest() {

        String value = null;

        Assertions.assertNull(value);

    }

    @Test
    void assertIterableEquals() {

        List<Integer> list1 = List.of(1, 2);
        List<Integer> list2 = List.of(1, 2);

        Assertions.assertIterableEquals(list1, list2);

    }

    @Test
    void assertAll() {

        List<Integer> list1 = List.of(1, 2);
        List<Integer> list2 = List.of(1, 2);

        String expect = "eve";
        String actual = "eve";

        Assertions.assertAll("Assert All", ()->{
            Assertions.assertEquals(expect, actual);
            Assertions.assertIterableEquals(list1, list2);
        });

    }

}
