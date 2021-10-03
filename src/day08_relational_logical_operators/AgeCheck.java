package day08_relational_logical_operators;

public class AgeCheck {

    public static void main (String []args){

        int age = 2;
        boolean isAToddler = age <= 3;
        boolean isASenior = age >=65;


        System.out.println("Is still a toddler:" + isAToddler);
        System.out.println("Is a Senor:" + isASenior);
    }
}
