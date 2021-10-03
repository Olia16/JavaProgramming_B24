package day10_scanner;

public class Examples {

    public static void main(String[] args) {
        String address = "12445";
        address = address + " something road";

        System.out.println(address);

        address = "new words" + address;

        double totalPrice = 0;
        //kept asking for price

        double price1 = 10;
        totalPrice += price1;

        double price2 = 4;
        totalPrice += price2;


        System.out.println(totalPrice);


    }
}
