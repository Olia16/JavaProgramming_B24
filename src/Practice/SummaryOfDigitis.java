package Practice;

public class SummaryOfDigitis {

    public static int sum(String s){

        int sum = 0;
        char [] chars = s.toCharArray();// convert string to char array
        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(chars[i])){
                sum += Integer.parseInt("" + s.charAt(i));
            }
        }
        return sum;

    }

    public static void main(String[] args) {
        System.out.println(sum("HHH101"));
    }
}
