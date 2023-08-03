

public class Car {

    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    public String updateModel(String model) {
        this.model = model;
        return this.model;
    }
    public String toString(){
        return System.out.println("Make:" + make + "Model" + model + "Year:" + Year);
    }
    


    public static void main(String[] args) {
        Car carOne = new Car("Volvo", "V40", 2012);
        Car carTwo = new Car("Porsche", "Panamera", 2009);
        Car carThree = new Car("Audi", "A3", 2018);

        System.out.println(carOne.getYear());
        System.out.println(carOne.getModel());
        carOne.updateModel("V60");
        System.out.println(carOne.getModel());
    }

}