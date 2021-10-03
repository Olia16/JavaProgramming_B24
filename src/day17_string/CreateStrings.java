package day17_string;

public class CreateStrings {
    public static void main(String[] args) {
        String first = "java"; // String literal
        // create a String object in the String pool

        String second = new String("java"); // String using new
        // creates a String object in the heap, NOT the String pool

        System.out.println(first == second); // == with String does not check the value
        // It checks the memory location and compares them

        System.out.println(first.equals(second)); // .equals compares the values, not memory location

        String third = "java";

        System.out.println(first == third);

        String fourth = third;

    }
}
