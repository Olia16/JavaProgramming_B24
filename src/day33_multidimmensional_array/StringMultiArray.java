package day33_multidimmensional_array;

import java.util.Arrays;

public class StringMultiArray {
    public static void main(String[] args) {

        String [][] cybertek = new String [4][]; // 4 tells how many arrays; 2 tell what size they are

        String [] group1 = {"Sergii", "Nisso", "Rano"};
        String [] group2 = {"Mubarek", "Ibrahim"};
        String [] group3 = {"Nadir", "Saim"};
        String [] group4 = {"Nicole", "Tach", "Aliya","Mohammed"};

        cybertek[0] = group1;
        cybertek[1] = group2;
        cybertek[2] = group3;
        cybertek[3] = group4;

        System.out.println(cybertek.length);
        System.out.println(Arrays.deepToString(cybertek));

        System.out.println();

        for(String [] groups : cybertek){
            //System.out.println(Arrays.toString(groups));
            System.out.println("\n -> Group members:");
            for(String member : groups){
                System.out.print(member.trim() + " ");
            }
        }
    }
}
