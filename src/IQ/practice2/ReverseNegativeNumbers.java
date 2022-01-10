package IQ.practice2;

public class ReverseNegativeNumbers {
    /*
    .Number -- Reverse negative number
Write a return method that can reverse negative number and return it as int.
     */
    public int reverseNumber(int num){
        int remainder = 0;
        int reversedNum = 0;
        while(num != 0){
            remainder = num%10;//4//3//2//1
            reversedNum = reversedNum * 10 + remainder;//0//4//43//432//4321
            num = num/10;//123//12//1//0
        }
        return reversedNum;
    }
}
