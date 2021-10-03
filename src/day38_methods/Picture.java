package day38_methods;

public class Picture {

    public static void main(String[] args) {
        draw(50);
        draw("red");
        draw("blue", "green");
        draw(5);
    }

    public static void draw(String color){
        System.out.println("Using one color");

    }
    public static void draw(String color1, String color2){
        System.out.println("using 2 more colors");
    }
    public static void draw(int size){
        System.out.println("Drawing " + size + " inches pictures");
    }
}
