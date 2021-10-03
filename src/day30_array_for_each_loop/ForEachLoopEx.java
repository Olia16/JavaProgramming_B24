package day30_array_for_each_loop;

public class ForEachLoopEx {
    public static void main(String[] args) {
        // original loop
        String [] strs = { "java", "selenium", "db", "api"};
        for(int i = 0; i < strs.length; i++){
            System.out.println(strs[i]);
        }
        // for each loop
        for (String word : strs){
            System.out.println(word);
        }
    }
}
