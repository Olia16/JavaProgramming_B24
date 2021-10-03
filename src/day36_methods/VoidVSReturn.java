package day36_methods;

public class VoidVSReturn {
    public static void main(String[] args) {
        sayHello();
        // String s = sayHello(); - cannot assign void method
        // System.out.println(sayHello()) - cannot print it, only call a method
        sayBye();
        String bye = sayBye();
        System.out.println(bye);

        System.out.println(sayBye());

    }

    // void method with no params()
   public static void sayHello(){
       System.out.println("Hello World");
   }

   public static String sayBye(){
        return "Bye word";
   }



}
