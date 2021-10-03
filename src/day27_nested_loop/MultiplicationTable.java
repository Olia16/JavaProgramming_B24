package day27_nested_loop;

public class MultiplicationTable {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            System.out.println(" ---- Table for " + i + " ----");
            for (int a = 1; a <= 10; a++){
                System.out.println(i + " x " + a + " = " + (i*a));
            }
        }
    }
}
