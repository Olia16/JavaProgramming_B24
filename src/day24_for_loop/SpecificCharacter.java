package day24_for_loop;

public class SpecificCharacter {
    public static void main(String[] args) {
        String str = "java apples";

        int count = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'a'){
               count++;
            }
        }
        System.out.println("a was found: " + count + " times");


        String sentence = "I loooooove coding java";
        int sum = 0;

        for(int i = 0; i < sentence.length();i++){
            if(sentence.charAt(i) == 'o'){
                sum++;
            }
        }
        System.out.println("o was found " + sum + " times");

    }
}
