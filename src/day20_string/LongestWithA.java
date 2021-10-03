package day20_string;

public class LongestWithA {
    /*
    [Longest with A]
Given three String variables of some text find and print the longest word that also contains 'a'
Ex: "java"
"mouse" "computer" Output: java
Ex: "java"
"mouse" "apples" Output: apples

Challenge: Instead of just checking for 'a' add another variable that can be used to check for any character.
     */
    public static void main(String[] args) {
        String word1 = "java";
        String word2 = "computer";
        String word3 = "pples";

        String biggest = "";

        if (word1.contains("a") && word1.length() > biggest.length()) {
            biggest = word1;
        }
        if (word2.contains("a") && word2.length() > biggest.length()) {
            biggest = word2;
        }
        if (word3.contains("a") && word3.length() > biggest.length()) {
            biggest = word3;
        }
        System.out.println(  (biggest.isEmpty() ? "None are valid" : "biggest: " + biggest));
    }
}