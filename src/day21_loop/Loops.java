package day21_loop;

public class Loops {

    public static void main(String[] args) {
//        System.out.println("Hello world");
//
//        while(true){
//            System.out.println("Hello world");
//            break;
//        }

        int number = 1;
        while (number <= 100) {
            System.out.println("Hello world" + number);
            number++;
        }

        int number2 = 1;
        while (number2 <= 100) {
            System.out.println("Hello universe" + ++number2);

        }
        int number3 = 0;
        while (number3++ <= 100) {
            System.out.println("Hello Galaxy");
        }
        System.out.println(number3);
    }
}
