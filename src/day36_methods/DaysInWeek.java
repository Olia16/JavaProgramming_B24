package day36_methods;

public class DaysInWeek {
    public static void main(String[] args) {
        System.out.println(getDayOfWeek(7));

        String day3 = getDayOfWeek(7);
        if (day3.equals("Saturday") || day3.equals("Sunday")){
            System.out.println("Its the weekend");
        }else{
            System.out.println("Its the weekday, but weekend is coming");
        }

    }

    public static String getDayOfWeek(int num){
        String day = "";
        switch (num){
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "non - valid number giver";
        }
        return day;
    }
}
