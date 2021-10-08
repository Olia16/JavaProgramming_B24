package Practice;

public class FrequencyOfChars2 {

    /*
    return method that finds frequency of chars
    return type String
    parameter string
     */

    public static String frequencyOfChars(String str){

        String output = "";//aaabbbccc

        for (int i = 0; i < str.length(); i++){
         int count = 0;

        for(int j = 0 ; j < str.length(); j++){
            if(output.contains("" + str.charAt(i))) continue;
            if(str.charAt(i) == str.charAt(j)){
                count++;
            }
        }
            if(count > 0){
                output += str.charAt(i) + "" + count;
            }
        }

        return output;
    }

    public static void main(String[] args) {
        System.out.println(frequencyOfChars("aaabbbcccdd"));
    }
}
