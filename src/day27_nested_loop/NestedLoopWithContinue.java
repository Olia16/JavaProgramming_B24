package day27_nested_loop;

public class NestedLoopWithContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.println("first" + "i: " + i);
            for (int j = 1; j <= 3; j++) {
                if (j == 2) {
                    continue; // skips

                }
                System.out.println("second" + "i:" + i + "j: " + j);
            }
        }
    }
}
