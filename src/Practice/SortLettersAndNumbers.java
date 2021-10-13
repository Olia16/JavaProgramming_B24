package Practice;

import java.util.Arrays;

public class SortLettersAndNumbers {
/*
    Q6: String -- Sort Letters and Numbers from alphanumeric String
    Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers, sort the individual string and append them back together
    Ex:
    Input:  "DC501GCCCA098911"
    OutPut: "CD015ACCCG011899"
*/
public static void main(String[] args) {
    String input = "DC501GCCCA098911";
    String newStr = ""; //
    for(int i = 0; i < input.length()-1; i++){
        if((Character.isLetter(input.charAt(i)) && Character.isDigit(input.charAt(i+1)) || (Character.isDigit(input.charAt(i)) && Character.isLetter(input.charAt(i+1))))){
            newStr += input.charAt(i) + " ";
        }else{
            newStr += input.charAt(i);//dc_501_gccca_098911
        }
    }
    System.out.println(newStr);
    String output = "";
    for(String each : newStr.split(" ")){ //dc
        char [] chars = each.toCharArray(); //d
        Arrays.sort(chars); //cd
        for(char c : chars){ //cd
            output += c; //cd
        }
    }

    System.out.println(output);
}

}
