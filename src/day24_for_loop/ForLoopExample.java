package day24_for_loop;

public class ForLoopExample {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }
    }
}
      /*
        flow of FOR LOOP
        - executes initialization part: the int i = 1;
        - checks the boolean/condition part : i <= 10;
                 if true - loop will run
                 if false - loop stops
        - if true, runs statement : System.out.println(i);
        - then it increments and checks again if is true or false....

        */