package day16_switch;

import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        boolean isGreen = false;
        String action = isGreen ? "go" : "stop";
        System.out.println(action);

        String name = "Nadir";
        String className = name.equals("Nadir")? "Soft skills" : "Java";
        System.out.println(className);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        System.out.println(number % 2 == 0 ? "Even number" : "Odd number");

        System.out.println("Enter number one");
        double numberOne = input.nextDouble();
        System.out.println("Enter number two");
        double numberTwo = input.nextDouble();

        double max = numberOne > numberTwo ? numberOne : numberTwo;
        System.out.println(max);


    }
}
