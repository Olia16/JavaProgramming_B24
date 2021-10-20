package day02_print_statements;

import day49_encapsulation.AccessModifier;

public class ComeBackFromFuture {

    public static void main(String[] args) {
        AccessModifier object = new AccessModifier();
        object.a = 1; // we can access our public variable - a
       // object.b = 2; b - we don't have access to default b, it can only be accessed in the same package
       // object.c = 3; c - private, cannot be accesses outside the class


    }
}
