package ExtraPractice;

import java.util.Random;

public class RandomClassPractice {

    public static void main(String[] args) {

        Random random = new Random();

        System.out.println(random.nextInt(10));
        System.out.println(random.nextInt());
        char letter = (char) random.nextInt(2);
        for (int i = 0; i < 10; i++) {
            if(letter >='A' && letter <= 'Z') break;
            letter= (char) random.nextInt(91);
        }
        System.out.println(letter);

        System.out.println();

        while (letter <=97 || letter >= 122){
            letter= (char) random.nextInt(123);
        }
        System.out.println(letter);
    }
}
