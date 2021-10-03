package office_hours.practice_09_15_2021;

public class LongestPalindrome {
     /*
    [IQ] Longest Palindrome
        Given a String array. Find the longest Palindrome String in your array.
        Ex:
        Input: [“java”, “longer word”, “civic” “apple”, “racecar”, “mom”, “anna”]
        Output: racecar
        Ex:
        Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]
        Output: No palindrome
     */

    public static void main(String[] args) {

        String [] words = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
        String longest = "";

        for(String eachWord : words){

            boolean isPalindrome = true;

            for(int i = 0; i < eachWord.length()/2; i++){

                if(eachWord.charAt(i) != eachWord.charAt(eachWord.length() - 1 - i)){
                    isPalindrome = false;
                    break;
                }

                /*
                    the length - 1 - i
                    part allows you to read the characters from the end in the same number of iterations that i goes forwards
                    Instead of this approach you could have also made another variable that starts from the last index and decrements everytime
                 */

            }

            if(isPalindrome && eachWord.length() > longest.length()){
                longest = eachWord;
            }
        }

        System.out.println("Longest:  " + (longest.isEmpty() ? "NO PALINDROME" : longest));
        /*
            java
            0123
            0 -> 3
            1 -> 2
         */
    }
}
