package day09_scanner_logical;

// import goes here

import java.util.Scanner;

public class ScannerObject {
     public static void main(String []args){

         // This is the object
         Scanner input = new Scanner(System.in);
         System.out.println("Enter a byte number: ");
        byte numberOne =  input.nextByte();
         System.out.println(numberOne);



     }
}
