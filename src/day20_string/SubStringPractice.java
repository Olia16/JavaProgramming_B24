package day20_string;

public class SubStringPractice {
    public static void main(String[] args) {
        String word = "abcdefghi";
        System.out.println(word.substring(4));
        System.out.println(word.substring(6));

        System.out.println(word.substring(4,6));
        System.out.println(word.substring(4,7));
       // System.out.println(word.substring(4,3)); // error
        System.out.println(word.substring(0,8));
       // System.out.println(word.substring(0,10)); // error
        System.out.println(word.substring(4,4));


    }
}
