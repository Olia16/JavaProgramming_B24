package IQ.practice;

public class DivisibleBy {
/*
Numbers -- Divisible by 3, 5, 15
Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section
if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section
if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section.
 */
public static void main(String[] args) {
    String by3  = "Divisible by 3: ";
    String by5  = "Divisible by 5: ";
    String by15 = "Divisible by 15: ";

    for(int i = 1; i <= 100; i++){

        if(i % 3 == 0 && i % 5 == 0){
            by15 += i + ", ";
        }else if(i % 3 == 0){
            by3 += i + ", ";
        } else if (i % 5 == 0) {
            by5 += i + ", ";
        }

    }
    System.out.println(by3);
    System.out.println(by5);
    System.out.println(by15);
}

}
