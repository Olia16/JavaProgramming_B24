package day47_constructors;

public class Item {

    String name;
    int quantity;
    double price;
    double totalCost;

    // 2 constructors;
    // method to String
    //method calculate cost : quantity * price = total price;

    public Item(String name){
        this.name = name;
    }
    public Item(String name, int quantity, double price){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        calculate();
    }
    public double calculate(){
        totalCost = quantity * price;
        return totalCost;
    }

    @Override
    public String toString() {
        return "Item " +
                "name: '" + name + '\'' +
                ", quantity: " + quantity +
                ", price: " + price +
                ", totalCost: $" + totalCost +
                '}';
    }
}
