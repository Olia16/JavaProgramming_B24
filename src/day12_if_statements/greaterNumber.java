package day12_if_statements;

public class greaterNumber {
    public static void main(String[] args) {
        /*
    Write Java program that will have three numbers and print the greatest number.

    First number: 4
    Second number: 8
    Third number: 1

    Output:
    The greatest number from 4, 8, 1 is:  8
     */
   int first = 15;
   int second = 18;
   int third = 10;

   int biggest = 0;
   if (first > second && first > third){
       biggest = first;

   }
   if(second > first && second > third){
       biggest = second;
   }
   if(third > first && third > second){
       biggest = third;
   }
        System.out.println("Our biggest number is: " + biggest);

    }

}
