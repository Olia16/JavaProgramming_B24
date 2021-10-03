package day22_loops;

import java.util.Scanner;

public class HelloProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        ask for a message
        hello -> hola

        bye -> ok bye
         */
        boolean continueTalk = true;
        while (continueTalk){
            System.out.println("Enter your message");
            String msg = input.nextLine();

            if(msg.equalsIgnoreCase("hello")){
                System.out.println("hi");
            }else if (msg.equalsIgnoreCase("bye")){
                System.out.println("okay bye");
                continueTalk = false;
            }

            System.out.println(msg);
        }
    }
}
