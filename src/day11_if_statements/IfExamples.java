package day11_if_statements;

public class IfExamples {
    public static void main(String[] args) {
        if(false) {
            System.out.println("Hello world");

        }
        if(false) {
            System.out.println("Hello world 2");

        }
        int score = 30;
        if (score>60) {
            System.out.println("you passed");
        }
        if(score<= 60){
            System.out.println("you failed");
        }
        if(score > 60){
            System.out.println("You passed");
        }
        else{
            System.out.println("You failed");
        }

    }
}
