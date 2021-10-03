package day13_multiple_branches;

import java.util.Scanner;

public class YesOrNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your first name?");
        String firstName = input.next();

        System.out.println("do you like soccer");
        String likeSoccer = input.next();

        if(likeSoccer.equals("yes") || likeSoccer.equals("Yes") || likeSoccer.equals("YES")){
            System.out.println(firstName + "Who is your favourite team?");
            String team = input.next();
            System.out.println(firstName + "Oh I like " + team + " too");
        }else if(likeSoccer.equals("no")){
            System.out.println(firstName + "That's okay");
        }else{
            System.out.println( firstName + "You didn't answer the question");
        }

    }
}
