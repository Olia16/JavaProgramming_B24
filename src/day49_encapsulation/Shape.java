package day49_encapsulation;

public class Shape {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(-10, - 20);
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getLength());

        rectangle.setLength(20);
        rectangle.setWidth(10);
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.calculate());

    }
}
