package Practice;

public class FindUnique {

    /*
    create return method that finds a unique character in a String
    returns String
    parameter string
     */

    public static String unique(String s){

        String container = "";
        for(int i = 0; i < s.length(); i++){
            int count = 0;
            for(int j = 0 ; j < s.length();j++){

                if(s.charAt(i) == s.charAt(j)){
                    count++;
                }
            }
            if(count <= 1){
                container += s.charAt(i);
            }
        }
        return container;
    }
    public static void main(String[] args) {
        System.out.println(unique("hello"));
    }
}
