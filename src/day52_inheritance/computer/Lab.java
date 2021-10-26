package day52_inheritance.computer;

public class Lab {

    public static void main(String[] args) {
        Windows computer1 = new Windows(16);
        Windows computer2 = new Windows(1000);


        System.out.println(computer1.os);
        System.out.println(computer2.memory);

        Mac computer3 = new Mac(120);
        Mac computer4 = new Mac(160);

        System.out.println(computer4);


    }
}
