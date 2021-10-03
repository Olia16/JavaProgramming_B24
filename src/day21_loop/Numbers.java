package day21_loop;

public class Numbers {
    public static void main(String[] args) {
        // go from 1 - 100, print only even numbers
        int num = 1;
        while (num++ <= 100) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
            int num2 = 1;
            while (num2++ <= 100) {
                if (num2 % 2 != 0) {
                    System.out.println(num2 + " ");

                }
            }
        }
    }

}
