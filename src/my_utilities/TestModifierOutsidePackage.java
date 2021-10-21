package my_utilities;

import day51_inheritance.Modifier;

public class TestModifierOutsidePackage {

    public static void main(String[] args) {
        Modifier obj = new Modifier();
        System.out.println(obj.A);
        // System.out.println(obj.B); cannot be accessed outside the package,protected var
        //System.out.println(obj.C); cannot be accessed outside the package, default var
        // System.out.println(obj.D); cannot be accessed, its private var
    }
}
