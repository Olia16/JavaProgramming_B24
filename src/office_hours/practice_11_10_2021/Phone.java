package office_hours.practice_11_10_2021;

public abstract class Phone {

    String brand;
    String model;
    double price;
    int size;

    public Phone(String brand, String model, double price, int size) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.size = size;
    }

    public abstract void calling();
    public abstract void texting();

    @Override
    public String toString() {
        return "Phone: " +
                "brand:'" + brand + '\'' +
                ", model: '" + model + '\'' +
                ", price: " + price +
                ", size: " + size +
                '}';
    }

    /*
    Abstract + Interface Practice

Create an abstract class called Phone
    attributes: brand, model, price, size
    abstract methods: calling(), texting()
    instance method: toString()





Create an interface named AndroidApps that can inherit from downloadable
    interface variable: AppStoreName
    abstract method(): insertMemoryCard();



Create a class named iPhone that will be the sub class of Phone. Also implement the AppleApps interface
    implement all abstract methods

Create a class named Samsung that will be the sub class of Phone. Also implement the AndroidApps interface
    implement all abstract methods

    Create constructors in each sub class that can initialize the instance variables
     */
}
