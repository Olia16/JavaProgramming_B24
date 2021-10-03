package day39_wrapper_arraylist;

public class CharacterMethods {
    public static void main(String[] args) {
        /*
        to if a character was uppercase
        loop through the character
        char >= 'A' and char <= 'z'
         */

        //  checks if the character is uppercase, and returns true of false
        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.isUpperCase('Z'));

        //  checks if the character is lowercase, and returns true of false
        System.out.println(Character.isLowerCase('z'));
        System.out.println(Character.isLowerCase('Z'));


        //  checks if the character is Digit, and returns true of false
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isDigit('0'));
        System.out.println(Character.isDigit('i'));
    }
}
