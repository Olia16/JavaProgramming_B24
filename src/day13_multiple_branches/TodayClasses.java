package day13_multiple_branches;

public class TodayClasses {
    public static void main(String[] args) {
        /*
        monday,wednesday,thursday,saturday,sunday - java
        tuesday - soft skills
        friday - off
         */
        String day = "friday";

        boolean IsTechnicalDay = day.equals("monday") || day.equals("wednesday") || day.equals("thursday") || day.equals("saturday") || day.equals("sunday");
        boolean isSoftSkills = day.equals("tuesday");
        boolean isFriday = day.equals("friday");

        if(IsTechnicalDay){
            System.out.println("java");
        }else if(isSoftSkills){
            System.out.println("soft skills");
        }else{
            System.out.println("Invalid day given");
        }
    }
}
