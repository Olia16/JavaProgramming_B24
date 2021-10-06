package Practice;

public class FindTheUnique {

    public static String unique(String s){

        String uniqueC = "";

        for(int i = 0; i < s.length(); i++){
            int count = 0;
            for(int j = 0; j < s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){ //hello
                    count++;
                }
            }
            if(count <= 1){
                uniqueC += s.charAt(i);
            }
        }
        return uniqueC;


    }

    public static void main(String[] args) {
        System.out.println(unique("apple"));
    }
}
