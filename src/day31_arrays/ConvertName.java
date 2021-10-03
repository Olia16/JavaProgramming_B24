package day31_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = input.nextLine();

        char [] newName = name.toCharArray();
        System.out.println(Arrays.toString(newName));

        System.out.println(name.toCharArray()[0]); // gives first letter
        System.out.println(newName[0]); // directly gives first letter

        System.out.println(newName[newName.length -1]); // gives last letter
        System.out.println(newName[newName.length - 2]);

    }
}
