package day58_exceptions.intro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SecondTry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
            System.out.println("enter a number");
            int num = input.nextInt();
            System.out.println("enter another number");
            int num2 = input.nextInt();
            System.out.println(num/num2);
        }catch (InputMismatchException e){
            System.out.println("you should print number");
        }catch (ArithmeticException e){
            System.out.println("cannot divide by '0'");
        }
    }
}
