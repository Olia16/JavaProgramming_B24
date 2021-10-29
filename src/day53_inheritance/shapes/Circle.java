package day53_inheritance.shapes;

public class Circle extends Shape {

    double radius;

    public Circle(double radius){
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double area(){
      return Math.PI * Math.pow(radius, 2.0);
          // Math.PI * radius * radius;

    }

    @Override
    public double perimeter() {
        return super.perimeter();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
