package day25_for_loop;

public class CharactersInString {
    /*
    Given a String print the ascii value codes for each character
    Ex:Input:“java”
    Output:1069711897
     */
    public static void main(String[] args) {

        String ste = "java";
        for(int i =0; i < ste.length(); i++ ){
            System.out.println((int)ste.charAt(i) + " " );
        }
    }
}
