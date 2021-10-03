package day24_for_loop;

public class MultiplicationTable {
    public static void main(String[] args) {
        /*
        number x 1
        number x 2
        number x 3

         */
        int number = 12;
     //   System.out.println(number*1);
     //   System.out.println(number*2);

        for(int i = 1; i <= 10; i++){
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
