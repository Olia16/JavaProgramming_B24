package Practice;

public class SumOfDigitsInString {

    public static int SumOfDigitsString(String s){
        int sum =0;
        char ch;
        int n;

        for(int i =0; i < s.length(); i++ ) {
            ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                n = Character.getNumericValue(ch);
                sum += n;
            }
        }

        return sum;
    }
    //create return boolean method
    // two strings as parameters
    // if the first contains the second one
}
