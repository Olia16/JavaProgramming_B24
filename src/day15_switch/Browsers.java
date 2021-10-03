package day15_switch;

import org.omg.CORBA.DynAnyPackage.Invalid;

import java.util.Scanner;

public class Browsers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Which browser are you trying to use?");
        String browser = input.next();
        System.out.println("Enter the url:");
        String url = input.next();

        switch (browser){

            case "chrome":
                System.out.println("Opening " + url + " in chrome");
                break;
            case "firefox":
                System.out.println("Opening " + url + "in firefox");
                break;
            case "safari":
                System.out.println("Your mac is opening safari");
                System.out.println("Going to " + url);
                break;
            case "ie":
                System.out.println("IE is not longer supported");
                break;
            case "edge":
                System.out.println("Edge is opening " + url);
                break;
            default:
                System.out.println("Invalid browser");

        }
    }
}
