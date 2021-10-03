package day25_for_loop;

public class CountApple {
    public static void main(String[] args) {

        String s = "I have ten apples, two apples for me the rest apples for my brother";
        int apples = 0;

        for(int i = 0; i < s.length()-5; i++){
            if(s.substring(i, i+6).equals("apples")){
                apples++;
            }
        }
        System.out.println("Sentence used apples: " + apples + " times");
    }
}
