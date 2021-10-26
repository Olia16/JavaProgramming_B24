package Practice;

public class DivideWithoutOperatorQ3 {

    /*
    3. Numbers -- Divide without / operator
Write a method that can divide two numbers without using division operator.
     */

    public static String divide(int num1, int num2){
        int remainder = 0;
        int result = 0;

        while(num1 >= num2){
            num1 -= (num2);
            result++;
            remainder = num1;
        }
        return "Dividend: " + (result) + "\nRemainder: " + remainder;
    }

    public static void main(String[] args) {
        System.out.println(divide(7,7));
    }
}
