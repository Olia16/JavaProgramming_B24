package Practice;

public class RemoveDuplicate {

    public static String removeDuplicate1(String s){

        String result  = "";

        for(int i = 0; i < s.length(); i++){

            if(!result.contains("" + s.charAt(i))){
                result += s.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(removeDuplicate1("java"));
    }

}
