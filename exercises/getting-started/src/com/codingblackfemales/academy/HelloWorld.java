package com.codingblackfemales.academy; // com/codingblackfemales/acadmey

import com.codingblackfemales.academy.Person;

public class HelloWorld {

    public static void main(String... args) {
        Person sarah = new Person("Sarah", 45);
        Person lucy = new Person("Lucy", 33);
        Person maria = new Person("Maria", 25);

        System.out.println(sarah.toString());
        System.out.println(lucy.toString());
        System.out.println(maria.toString());
    }
}