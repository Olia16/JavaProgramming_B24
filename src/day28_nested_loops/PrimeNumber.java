package day28_nested_loops;

public class PrimeNumber {
    public static void main(String[] args) {
        /*
        Given a number. Print out all the prime numbers from 2 to that number
        A prime number is a number that is only divisible by 1 and itself.
Ex:
Input: 50
Output:
2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47
         */
        int number = 9;
        boolean isPrime = true;

        for(int i = 2; i < number; i++){
            if(number % i == 0){
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime);
    }
}
