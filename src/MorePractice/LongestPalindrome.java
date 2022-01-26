package MorePractice;

public class LongestPalindrome {

    public static void main(String []args){
        //Given a String array. Find the longest Palindrome String in your array.
        //Ex:
        //Input: [“java”, “longer word”, “civic” “apple”,  “racecar”, “mom”, “anna”]
        //Output: racecar
        //Ex:
        //Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]
        //Output: No palindrome

        String [] strArr = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
       int count = 0;
       String palindrome = "";
       for(String each: strArr){
           String reverse = "";

           for (int i = each.length()-1; i>=0; i--){
               reverse += each.charAt(i);

           }
           if(each.equals(reverse) && reverse.length() > count){
               count = reverse.length();
               palindrome = each;
           }

       }
        System.out.println(palindrome);


    }
}
