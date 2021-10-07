package day46_constructors;

public class FizzBuzz {

    public static String fizzBuzz(int num ){
        String str = "";

        if(num % 3 == 0){
            str += "Fizz";
        }
        if(num % 5 == 0){
            str += "Buzz";
        }

        return str.isEmpty() ? "" + num : str;
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(7));
        System.out.println(fizzBuzz(15));
    }
}
