package day13_multiple_branches;

public class StringCompare {
    public static void main(String[] args) {
        String city = "Chicago";
        if(city .equals("McLean")){
            System.out.println("City is Virginia");
        }else{
            System.out.println("City is not in Virginia");
        }
        if(city.equals("Chicago")){
            System.out.println("City is in Illinois");
        }else{
            System.out.println("City is not in Illinois");
        }

        String str = "java";
        String str2 = "javascript";

        if(!str.equals(str2)){
            System.out.println("String are not equal");
        }else{
            System.out.println("String are equal");
        }

    }
}
