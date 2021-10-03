package day11_if_statements;

import java.util.Scanner;

public class SmallTasks {
    public static void main(String[] args) {
        /*
        Small tasks-
        1-Write an if statement that assigns 5 to x when y is equal to 20
        2-Write an if statement that sets the variable fees to 50 if the Boolean variable max is true
        3-Write an if statement that assigns 20 to the variable a if variable b is 50 and c is greater and equal to 100
        4-Write an if statement that prints Ideal Temp if the temp is between 70 and 80
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Insert value of y");
        int y = input.nextInt();
        if (y == 20){
            int x =5;
            System.out.println(x);
        }
        /////////////////////////////////

        int c = input.nextInt();
        int b = input.nextInt();

        if (b == 50 && c >= 100 );{
            int a = 20;
            System.out.println("A: " + a);
        }




    }
}
