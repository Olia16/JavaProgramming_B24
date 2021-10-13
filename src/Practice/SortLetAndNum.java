package Practice;

import java.util.Arrays;

public class SortLetAndNum {

    public static String Sort(String s){

        String container = "";

        for(int i = 0 ; i < s.length() - 1; i++){
            if((Character.isLetter(s.charAt(i)) && Character.isDigit(s.charAt(i + 1))) || (Character.isDigit(s.charAt(i)) && Character.isLetter(s.charAt(i + 1)))){
                container += s.charAt(i) + " ";
            }else{
                container += s.charAt(i);
            }
        }

        String result = "";
        for(String each : container.split(" ")){
            char [] chars = each.toCharArray();
            Arrays.sort(chars);

            for(char element : chars){
                result += element;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Sort("DC501GCCCA098911"));
    }
}
