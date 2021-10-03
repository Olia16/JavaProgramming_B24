package day35_methods;

public class OurMathClass {
    public static void main(String[] args) {
        add(2,5);
        add(2,1);
        subtract(4,2);
        multiply(4.2,8.3);
        division(7.2,2.1);
        division(7,7);
    }
    /*
    add
    subtract
    multiply
    divide
     */

    public static void add(double num1, double num2){
        System.out.println("addition: " + num1 + " + "+ num2 + " = " + (num1+num2));
    }
    public static void subtract(int num3, int num4){
        System.out.println("subtraction: "+ num3 + " - " + num4 + " = " + (num3-num4));
    }
    public static void multiply(double num5, double num6){
        System.out.println("multiplication: " + num5 + " * " + num6 + " = " + (num5*num6));
    }
    public static void division(double num7, double num8){
        if(num8 != 0){
        System.out.println("division: " + num7 + "/" + num8 + " = " + (num7/num8));
    }else{
            System.out.println("cannot be divided by 0");
        }
    }
}
