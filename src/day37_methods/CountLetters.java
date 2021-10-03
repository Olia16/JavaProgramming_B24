package day37_methods;

public class CountLetters {
    public static void main(String[] args) {
        System.out.println(frequencyOfLetter("apple",'p'));
        System.out.println(frequencyOfLetter("java",'a'));
        System.out.println(frequencyOfLetter("hello",'p'));
        System.out.println(getDuplicateCharacters("hello"));
    }
    /*
    String, letter
    how many times is the letter in the String

     */
    public static int frequencyOfLetter(String word, char letter){
        int counter = 0;
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i)== letter){
                counter++;
            }
        }
        return counter;
    }

    // duplicate method
    public static String getDuplicateCharacters(String str){
        String allDuplicate = "";
        for(int i = 0; i < str.length(); i++){
            int count = frequencyOfLetter(str, str.charAt(i));
            if(count > 1){
                allDuplicate += str.charAt(i);
            }
        }
        return allDuplicate;
    }
}
