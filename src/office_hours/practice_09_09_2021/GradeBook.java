package office_hours.practice_09_09_2021;

import java.util.Arrays;
import java.util.Scanner;

public class GradeBook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many students will you enter");
        int size = input.nextInt();

        // make student array ans score array

        String [] students = new String[size];
        double [] scores = new double[size];
        char [] grades = new char[size];

        //ask user to enter the student and scores. fill up array

        for(int i = 0; i < size; i++){
            System.out.println("Please enter student " + (i + 1));
            students [i] = input.next();

            System.out.println("Please enter " + students[i] + "'s scores");
            scores [i] = input.nextDouble();

            if(scores[i] >=90){
                grades [i] = 'A';
            }else if(scores[i] >= 80){
                grades[i] = 'B';
            }else if(scores[i] >= 70){
                grades[i] = 'C';
            }else if(scores[i] >= 60){
                grades[i] = 'D';
            }else{
                grades[i] = 'F';
            }
        }
        System.out.println(Arrays.toString(students));
        System.out.println(Arrays.toString(scores));
        System.out.println(Arrays.toString(grades));
    }
}
