package day25_for_loop;

public class Syllables {
    /*
    Given a String separated by dashes
    calculate how many syllables the words are
    Ex:Input:ja-va
    Output:2
     */
    public static void main(String[] args) {
        String word = "ja-va-va";
        int dashes = 0;

        for( int i = 0; i < word.length(); i++){
            if(word.charAt(i) == '-'){
                dashes++;
            }
        }
        System.out.println("String have: " + (dashes + 1) + " syllables");
    }
}
