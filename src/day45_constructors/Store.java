package day45_constructors;

public class Store {
    public static void main(String[] args) {
        Carpet carpet = new Carpet(2,2,10,true);
        System.out.println(carpet);
        System.out.println(carpet.unitPrice);
        System.out.println(carpet.isPersian);
        System.out.println(carpet.totalPrice);

        Carpet carper2 = new Carpet(2, 2,10, false);
        System.out.println("Carpet 2: " + carper2);
    }
}
