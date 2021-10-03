package day25_for_loop;

public class BiggestSubstring {
    /*
    Biggest substring of matching characters
    Given a String find the biggest substring of chars that match and print it.
    Ex: aaabbbcccccddddee
    Output: ccccc
     */
    public static void main(String[] args) {
        String str = "aaaaaaaabbbcccccddddee";
        String other = "";
        String longSub = "";

        for(int i = 0; i < str.length() - 1; i++ ){
            other += str.charAt(i);

            if(str.charAt(i) != str.charAt(i + 1)){
                if(other.length() > longSub.length()){
                    longSub = other;
                }
                other = "";
            }
        }
        System.out.println(longSub);
    }
}
