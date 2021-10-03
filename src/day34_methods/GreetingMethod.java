package day34_methods;

public class GreetingMethod {
    public static void main(String[] args) {
        Hello("Nadir");
        Hello("Olha");
        Hello("Saim");
    }


    public static void Hello (String name){
        System.out.println("Hello " + name + ", how are you?");
    }
}
