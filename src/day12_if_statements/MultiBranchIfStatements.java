package day12_if_statements;

public class MultiBranchIfStatements {
    public static void main(String[] args) {

        /*
        1 - Monday
        2 - Tuesday
        ...
        7 - Sunday
         */
        int day = 2;
        String result = "";
        if (day == 1) {
            result = "Monday";
        } else if (day == 2) {
            result = "Tuesday";
        } else if (day == 3) {
            result = "Wednesday";
        } else if (day == 4) {
            result = "Thursday";
        } else if (day == 5) {
            result = "Friday";
        } else if (day == 6) {
            result = "Saturday";
        } else if (day == 7) {
            result = "Sunday";
        }else{
            result = "Invalid day";
        } System.out.println(result);

    }
}