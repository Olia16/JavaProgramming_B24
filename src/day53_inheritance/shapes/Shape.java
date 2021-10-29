package day53_inheritance.shapes;

public class Shape {
    String name;
    public Shape(String name){
        this.name = name;
    }

    public double area(){
        System.out.println("Generic Shape");
        return 0.0;
    }

    public double perimeter(){
        System.out.println("Generic Shape");
        return 0.0;
    }

}
