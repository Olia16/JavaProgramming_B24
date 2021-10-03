package day34_methods;

public class MyFirstMethod {
     // this method prints hello word
    public static void helloWorld(){
        System.out.println("Hello world");
    }
    public static void helloWorld50Times(){
        for(int i = 0; i < 50; i++){
            helloWorld();
        }

    }
    // the main method is used to call/run our methods
    public static void main(String[] args) {
        helloWorld();
        helloWorld();

        helloWorld50Times();
    }
}
