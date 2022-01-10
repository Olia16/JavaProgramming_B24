package IQ.practice;

public class IQ_3_Armstrong {
    public static boolean armstrong(int num){//153
        String digits = "" + num;//"153"
        int output = 0;
        for(int i = 0; i < digits.length(); i++){
            int number = Integer.parseInt("" + digits.charAt(i));//1
            output += Math.pow(number, digits.length());
        }
        if(num == output){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(armstrong(153));
    }

}
