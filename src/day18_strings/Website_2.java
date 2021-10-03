package day18_strings;

import java.util.Scanner;

public class Website_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a website");
        String website = input.nextLine();
        boolean validStart = website.startsWith("www.");
        boolean validEnd = website.endsWith(".com") || website.endsWith(".edu") || website.endsWith(".gov") || website.endsWith(".net");
        if(validStart && validEnd){
            System.out.println(website + " is valid");
        } else {

            if(!validStart) {
                System.out.println("needs to begin with www.");
            } else {
            }

            if(!validEnd){
                System.out.println("needs to end with: .com\n.edu\n.gov\nor .net");
            }

        }
    }
}

