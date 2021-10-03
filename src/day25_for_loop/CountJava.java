package day25_for_loop;

public class CountJava {
    public static void main(String[] args) {
        String s = "java is a language. java can be used for a lot java";
        int java = 0;

        for(int i = 0; i < s.length() - 3; i++){
           // System.out.println(s.substring(i, i+4));
            if(s.substring(i, i + 4).equals("java")){
                java++;
            }

        }
        System.out.println(java+ " times");

    }
}
