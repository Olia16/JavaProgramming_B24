package day22_loops;

import java.util.Scanner;

public class ColorPicker {
    public static void main(String[] args) {
        /*
        pick three colors
        needs to be unique

         */

        Scanner input = new Scanner(System.in);

        String pickedColors = "";
        int colorsPicked = 0;

        while (colorsPicked < 3) {
            System.out.println("Enter the color");
            String color = input.nextLine();
            if (pickedColors.contains(color)){
                System.out.println("pick a different color");
            }else{
                pickedColors += color + ", ";
                colorsPicked++;
            }
        }
        System.out.println("You picked " + pickedColors);
    }
}
