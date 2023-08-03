package com.codingblackfemales.academy;

public class Person {
    // Class scope
    final static String genome = "ACGT";
    static int population = 0;

    // Instance scope
    int age;
    String name;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        population = population + 1;
    }

    @Override
    public String toString() {
        return this.name + " is " + this.age + " years old and their genome is " + genome + " in a population of " + population;
    }
}