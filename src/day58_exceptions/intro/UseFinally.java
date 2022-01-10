package day58_exceptions.intro;

import java.util.Scanner;

public class UseFinally {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = "";
        try{
             name = input.next();
            System.out.println("pick a character index");
            System.out.println(name.charAt(input.nextInt()));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("That was an invalid character, try again");
            System.out.println(name.charAt(input.nextInt()));
        }finally {
            System.out.println("CLOSING STORE");
            input.close();
        }
    }
}
