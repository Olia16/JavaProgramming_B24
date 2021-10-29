package IQ;

import java.util.Scanner;
public class IsPalindromeNumber {

    int Palindrome;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(isPalindrome(num));
    }

    // WRITE YOUR CODE HERE
    public static boolean isPalindrome(int number) {
        int palindrome = number; // //123
        int reverse = 0;

        while (palindrome != 0) {//123
            int remainder = palindrome % 10;//3/2/1
            reverse = reverse * 10 + remainder;//3/30+2=32/320+1=321
            palindrome = palindrome / 10;//12/1/0
        }

        // if original and the reverse of number is equal means
        // number is palindrome in Java
        //123 == 321
        return number == reverse;
    }


}
