package day26_unit2recap;

import java.util.Scanner;

public class MultiplyEnd {
    /*
    Given a String and a number return a String
    that has the ending character duplicated and attached by the number amount of times
    Ex:
    Input:
    Hello?
    3
    Output:
    Hello????
    Ex:Input:java
    5
    Output:javaaaaaa
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your text");
        String text = input.nextLine();
        System.out.println("Enter how many times you would like to repeat the end");
        int repeat = input.nextInt();

        for(int i = 0; i < repeat;i++){
            text += text.charAt(text.length() - 1);

        }
        System.out.println(text);
    }
}
