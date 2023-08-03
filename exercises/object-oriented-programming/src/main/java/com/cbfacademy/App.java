package com.cbfacademy;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    
        Car carOne = new Car("Volvo", "V40", 2012);
        Car carTwo = new Car("Porsche", "Panamera", 2009);
        Car carThree = new Car("Audi", "A3", 2018);

        System.out.println(carOne.getYear());
        System.out.println(carOne.getModel());
        carOne.updateModel("V60");
        System.out.println(carOne.getModel());
    }
}



