package day34_methods;

public class GetCharacters {
    public static void main(String[] args) {
        lettersFromAToZUpper();
        lettersAToZLower();
        lettersZToAUpper();
        lettersZtoALower();
        numbersFrom0To9();
        /*
    Print each one in one line

    - make method that will print all the letters from A to Z

    - make method that will print all the letters from a to z

    - make method that will print all the letters from Z to A

    - make method that will print all the letters from z to a

    - make method that will print all the letters from 0 to 9
     */


    }
    public static void lettersFromAToZUpper(){

        for (int i = 'A'; i <= 'Z'; i++) {
            System.out.print((char)i + " ");
        }
        System.out.println();
    }
    public static void lettersAToZLower(){
        for (int i = 'a'; i <= 'z'; i++) {
            System.out.print((char)i + " ");
        }
        System.out.println();
    }
    public static void lettersZToAUpper(){
        for (int i = 'Z'; i >= 'A'; i--) {
            System.out.print((char)i + " ");
        }
        System.out.println();
    }
    public static void lettersZtoALower(){
        for (int i = 'z'; i >= 'a'; i--) {
            System.out.print((char)i + " ");
        }
        System.out.println();
    }
    public static void numbersFrom0To9(){
        for (int i = '0'; i <= '9'; i++) {
            System.out.print((char) i + " ");
        }
    }
}

