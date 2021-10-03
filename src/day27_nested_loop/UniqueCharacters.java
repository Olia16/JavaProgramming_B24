package day27_nested_loop;

public class UniqueCharacters {
    public static void main(String[] args) {
        String s = "java";
        //          "java";

        for (int i = 0; i < s.length(); i++) {
            int count = 0;  // created in outer loop to reset count to 0 everytime the outer loop runs
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
            if(count == 1){
                System.out.println(s.charAt(i) + " is unique");
            }
        }

    }
}
