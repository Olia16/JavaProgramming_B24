package IQ.practice;

public class EvenOrOdd_2 {
    //2.Numbers -- odd & even
    //Write  a method which can identifies given number is even or odd

        public static String identify(int num){
            return  (num % 2 == 0) ? "Even" : "Odd";
        }

        public static void main(String[] args) {
           System.out.println(identify(12));
        }
}
