package day58_exceptions.intro;

public class Types {
    public static void main(String[] args) {
        System.out.println("Hello");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello");
    }
}
