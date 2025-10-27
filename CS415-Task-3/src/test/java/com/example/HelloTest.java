package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelloTest {
    @Test
    void greetWithName() {
        assertEquals("Hello, Alice!", Hello.greet("Alice"));
    }

    @Test
    void greetWithNullReturnsWorld() {
        assertEquals("Hello, World!", Hello.greet(null));
    }
}
