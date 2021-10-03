package day09_scanner_logical;

public class EligibleToVote {

    public static void main(String []args){

        boolean isUSCitizen = true;
        int age = 30;
        boolean hasCriminalBackground = true;

        boolean isEligible = isUSCitizen && age >= 18 && !hasCriminalBackground;

        System.out.println(isEligible);
    }
}
