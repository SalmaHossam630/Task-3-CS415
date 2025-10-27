package com.example;

public class Hello {
    public static String greet(String name) {
        if (name == null) return "Hello, World!";
        return "Hello, " + name + "!";
    }
}
