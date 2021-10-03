package day13_multiple_branches;
import java.util.Scanner;
public class OxygenLevel {
    /*
    [Oxygen level - If statements, operators]

You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level

Above 90 - Your tank is full
Above 80 - Still okay
Above 70 - Don't go too far
Above 60 - Start to head back
Above 50 - Be careful now you at at 50%
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the oxygen level?");
        int oxygenLevel = input.nextInt();
        String message = "";

       /* if(oxygenLevel >= 50 && oxygenLevel > 60){
            message = "Be careful now you are at 50%";
        }else if(oxygenLevel >= 60){
            message = "Start to head back";
        }
        System.out.println(message);

        */
        if(oxygenLevel >= 90){
            message = "Your tank is full";
        }else if(oxygenLevel >= 80){
            message = "Still okay";
        }else if(oxygenLevel >= 70){
            message = "Don't go too far";
        }else if(oxygenLevel >= 60){
            message = "Start to head back";
        }else if(oxygenLevel >= 50){
            message = "Be careful now you at at 50%";
        }else{
            System.out.println("Below 50%");
        }
        System.out.println(message);


    }
}
