package day09_scanner_logical;

import java.util.Scanner;

public class Angles {

    public static void main (String [] args){

        /*
        180 - triangle
        360 - circle
        3 angles

         */

        Scanner input = new Scanner(System.in);
        int angleCounter = 1;

        System.out.println("Enter angle " + angleCounter++);
        double angleOne = input.nextDouble();
        System.out.println("Enter angle " + angleCounter++);
        double angleTwo = input.nextDouble();
        System.out.println("Enter angle " + angleCounter++);
        double angleThree = input.nextDouble();

        double sum = angleOne + angleTwo + angleThree;

        boolean isTriangle = angleOne + angleTwo + angleThree == 180;
        boolean isCircle = angleOne + angleTwo + angleThree == 360;

        System.out.println("Is a triangle" + isTriangle);
        System.out.println("Is a circle" + isCircle);





    }
}
