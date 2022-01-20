package IQ.practice;

public class IQ_2_PrimeNumbers {
//2. Numbers -- Prime Number
//Write a method that can check if a number is prime or not.

    public static boolean primeNum(int n){  //11
        if(n <= 1) return false;
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(primeNum(9));
    }
}
