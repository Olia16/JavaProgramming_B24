package day09_scanner_logical;

public class LogicalOperators {
    public static void main(String [] args){

        /*
        Math Ex:
        3 < i < 40
         */
//      int a = 3;
 //     int z = 40;
 //     int check = 5;
        int i =5;

      boolean output = i > 3 && i < 40;
        System.out.println(output);
        boolean output2 = i < 3 || i > 40;
        System.out.println(output2);


        int min = 3;
        int max = 40;


        System.out.println(i > min && i< max);
        System.out.println(i < min || i > max);

        System.out.println(true || false && true);

    }
}
