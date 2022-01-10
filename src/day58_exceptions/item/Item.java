package day58_exceptions.item;

public class Item{

    String name;

    public Item(String name){
        this.name = name;
    }

    public void use(){
        System.out.println("Using item");
    }
}
