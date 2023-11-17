package com.example.dayonetest;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.junit.jupiter.MockitoSettings;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@MockitoSettings
class FooTest {


    @Test
    @DisplayName("lombok test")
    void name() {
        Foo foo = new Foo();
        foo.setFoo("ddd");

        assertThat("ddd").isEqualTo(foo.getFoo());
    }

}