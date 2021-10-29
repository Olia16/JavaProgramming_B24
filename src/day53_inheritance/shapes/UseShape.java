package day53_inheritance.shapes;

public class UseShape {
    public static void main(String[] args) {

        Shape shape = new Shape("Shape");
        System.out.println(shape.name);
        System.out.println(shape.area());
        System.out.println(shape.perimeter());

        System.out.println();

        Square square = new Square(5);
        System.out.println(square.name);
        System.out.println(square.area());
        System.out.println(square.perimeter());

    }
}
