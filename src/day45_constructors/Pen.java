package day45_constructors;

public class Pen {

    String color;

    public Pen(String str){
        System.out.println("Made Pen Object" + str);
        color = str;
    }

    public static void main(String [] args){

        //old way/manual way:
        Pen obj = new Pen(" ");
        obj.color = "red";

        //making an object
        Pen pen = new Pen(" Red");
        new Pen(" Blue");
        new Pen(" Yellow");

    }
}
