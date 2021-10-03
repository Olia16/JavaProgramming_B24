package day27_nested_loop;

public class NestedLoopExample {
    public static void main(String[] args) {
        // print hello world 5 times
        // print hello Universe 1 time
        // print hello world 5 times
        // print hello Universe 1 time

        for(int j = 0; j < 3; j++){
            for(int i = 0; i < 5; i++){
                System.out.println("Hello world");
            }
            System.out.println("Hello Universe");
        }


//        for(int i = 0; i < 5; i++){
//            System.out.println("Hello world");
//        }
//        System.out.println("Hello Universe");
    }
}
