package day58_exceptions.intro;

public class FirstTry {
    public static void main(String[] args) {

        System.out.println("First line");

        try{
            String s = "java";
            System.out.println(s.charAt(0));
            System.out.println(s.charAt(100));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("WE got exception");
            e.printStackTrace();
        }


    }
}
