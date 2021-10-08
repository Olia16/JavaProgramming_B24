package day46_constructors;

public class MyOffer {

    public static void main(String[] args) {

        Offer first = new Offer("Kosmach", 156_000, true );
        System.out.println(first);

        Offer second = new Offer("Chicago", "Bank of America", 160_000, false, 20);
        System.out.println(second);
    }
}
