package day48_static;

public class iPhone {

    /*
    Task:

    iPhone

        instance variable:
            model, color, price, storage

        static variable:
            brand, operating system (os)

        constructor
            initialize all 4 variables

            optional: create another constructor that only needs model and price

        static block:
            initialize brand : Apple
            initialize os: IOS
     */
    String model;
    String color;
    double price;
    int storage;

    static String brand;
    static String operatingSystem;

    public iPhone(String model, String color, double price, int storage){

        this.model = model;
        this.color = color;
        this.price = price;
        this.storage = storage;
    }
    public iPhone(String model, double price){

        this.model = model;
        this.price = price;

    }

    static {
        brand = "Apple";
        operatingSystem = "IOS";
    }

    @Override
    public String toString() {
        return "iPhone:" +
                "model: '" + model + '\'' +
                ", color: '" + color + '\'' +
                ", price: " + price +
                ", storage: " + storage +
                '}';
    }
}
