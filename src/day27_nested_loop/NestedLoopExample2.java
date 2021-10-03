package day27_nested_loop;

public class NestedLoopExample2 {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            System.out.println("A");
            for(int j = 0; j < i; j++){
                System.out.println("B");
            }
        }
    }
}
