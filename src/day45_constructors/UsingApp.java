package day45_constructors;

public class UsingApp {
    public static void main(String[] args) {

        App firstApp = new App(); // creating object
        //now we have access to the 3 variables in app class

        // assign value to variables
        firstApp.name = "Google";
        firstApp.version = 4.0;
        firstApp.isFree = true;

        // calling update method
        firstApp.update();

        // printing all the info

        System.out.println(firstApp);// this line is trying to print out object but all it prints the memory location
        System.out.println("App information: ");
        System.out.println("Name: " + firstApp.name);
        System.out.println("Version:  " + firstApp.version);
        //using turnary to print boolean
        System.out.println(firstApp.isFree ? "App is free"  : "App cost money");


    }
}
