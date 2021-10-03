package office_hours.practice_09_02_2021;

public class DifferentLengthSubstring {
    public static void main(String[] args) {
        String s = "mouse";
        String s2 = "keyboard";

        int counterOne = 0;
        int counterTwo = 0;

        String msg = "mouseababckeyboardmouseabcdefkeyboard";

        for(int i = 0; i < msg.length(); i++){
            if(i <= msg.length() - s.length() && msg.substring(i, i + s.length()).equals(s)){
                counterOne++;
            }
            if(i <= msg.length() - s2.length() && msg.substring(i, i + s2.length()).equals(s2)){
                counterTwo++;
            }
        }
        System.out.println(counterOne == counterTwo);
    }
}
