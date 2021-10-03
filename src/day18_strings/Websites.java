package day18_strings;

import java.util.Scanner;

public class Websites {
    /*
    ask the user to type a website
    you should check if the website is valid
       A website is valid if it starts with www.
       and has
       .com
       .edu
       .net

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a website");
        String website = input.nextLine();

        if (website.startsWith("www.")) {

            if (website.endsWith(".edu") || website.endsWith(".com") || website.endsWith(".net")) {
                System.out.println("website is valid");
            } else {
                System.out.println("Website is invalid");
            }

        }
    }
}
