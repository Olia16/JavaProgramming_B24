package day24_for_loop;

public class CountHi {
    public static void main(String[] args) {
        String s = "aahiahiaaahihihhhhhhh";
        int hiCount = 0;

        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) == 'h' && s.charAt(i+1) == 'i'){
                hiCount++;
            }

        }
        System.out.println("HI was found: " + hiCount + " times in String");

    }
}
