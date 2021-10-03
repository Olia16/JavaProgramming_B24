package day11_if_statements;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
  Scanner input = new Scanner (System.in);
        System.out.println("Enter the temperature");
        int temp = input.nextInt();
  if(temp >= 70){
     System.out.println("Its a nice day");
     System.out.println("maybe go for a picnic");

 }else{
     System.out.println("Its cold");
     System.out.println("Stay home and write java code");

 }

    }
}
