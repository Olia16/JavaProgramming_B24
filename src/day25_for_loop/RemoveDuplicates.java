package day25_for_loop;

public class RemoveDuplicates {
    /*
    Remove Duplicates
    Write a program that can remove duplicates from a String
    Ex:Input:abcabc
    Output: abc
     */
    public static void main(String[] args) {
        String s = "abcdabcabch";
        String uniqueChars = "";  //abcd

        for(int i = 0; i < s.length(); i++){
         //   if(uniqueChars.contains("" + s.charAt(i))){
         //       continue;
            if (!uniqueChars.contains("" + s.charAt(i))){

                uniqueChars+= s.charAt(i);
            }

        }
        System.out.println(uniqueChars);

    }
}
