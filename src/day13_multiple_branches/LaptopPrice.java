package day13_multiple_branches;

import java.util.Scanner;
public class LaptopPrice {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Select screen size:");
            double screenSize = input.nextDouble();
            double laptopPrice = 0;

            if(screenSize == 13.3){
                laptopPrice += 200;
            }else if(screenSize == 15.0){
                laptopPrice += 300;
            }else if(screenSize == 17.3){
                laptopPrice += 400;
            }
            System.out.println("Select CPU type:");
            String CPUType = input.next();
            if(CPUType.equals("i3")){
                laptopPrice += 150;
            }else if(CPUType.equals("i5")){
                laptopPrice += 250;
            }else if(CPUType.equals("i7")){
                laptopPrice += 350;
            }
            System.out.println("Select RAM size:");
            int RAMsize = input.nextInt();
            if(RAMsize >= 4){
                laptopPrice = laptopPrice +(RAMsize/4) * 50;
            }
            System.out.println("Select storage type:");
            String storageType = input.next();

            System.out.println("Enter memory size:");
            int memorySize = input.nextInt();
            if(storageType.equals("HDD")){
                laptopPrice = laptopPrice + (memorySize/500) * 50;
            }else if(storageType.equals("SSD")){
                laptopPrice = laptopPrice + (memorySize/500) * 100;
            }
            System.out.println("Enter screen resolution:");
            String screenResolution = input.next();
            if(screenResolution.equals("FULLHD")){
                laptopPrice += 100;
            }else if(screenResolution.equals("4K")){
                laptopPrice += 200;
            }
            System.out.println("Laptop price is: $" + laptopPrice);

    }
}

