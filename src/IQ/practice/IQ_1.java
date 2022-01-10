package IQ.practice;

public class IQ_1 {
    /*
    Numbers -- print consecutive numbers
Write a function:

that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line. However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively. If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order. For example, numbers divisible by both 2 and 3 should be replacée by CodilityTest and numbers divisible by all three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.
     */

    public static void main(String[] args) {
        numbers(15);

        }

    public static void numbers(int n){

        for(int i = 1; i <= n; i++){
            String str = "";

            if(i % 2 == 0){
                str += "Codility";
            }
            if(i % 3 == 0){
                str += "Test";
            }
            if(i % 5 == 0){
                str += "Coders";
            }
            if(i % 5 != 0 && i % 3 != 0 && i % 2 != 0){
                str += i;
            }
            System.out.println(str);
        }
    }
    }


