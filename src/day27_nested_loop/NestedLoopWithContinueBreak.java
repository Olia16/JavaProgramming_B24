package day27_nested_loop;

public class NestedLoopWithContinueBreak {
    public static void main(String[] args) {
        for(int i = 1; i <= 3; i++){
            System.out.println("first");
            for (int j = 1; j <= 2; j++){
                if (j == 2) {
                    break; // breaks the inner loop, only one iteration will run
                }
                System.out.println("second");
            }
        }

    }
}
