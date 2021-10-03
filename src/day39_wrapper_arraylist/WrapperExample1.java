package day39_wrapper_arraylist;

public class WrapperExample1 {
    public static void main(String[] args) {
        int a = 5;


        // wrapper Integer example
        Integer i1 = new Integer(10);  //can be declared in two ways;
        Integer i2 = 100;  //can be declared in two ways/converts int to Integer wrapper class

        System.out.println(i1);
        System.out.println(i2);

        // example wrapper class with byte
        byte b = 4;
        Byte b1 = new Byte((byte)4);
        Byte b2 = (byte) 500;

        System.out.println(b);
        System.out.println("byte: " + b1);
        System.out.println(b2);

        System.out.println();

        // example wrapper class with short
        short s = 100;
        Short s1 = new Short((short) 200);
        Short s2 = 124;

        System.out.println(s);
        System.out.println("short: " + s1);
        System.out.println(s2);

        System.out.println();

        // example wrapper class with long
        long l = 1000L;
        Long l2 = new Long(2000L);
        Long l3 = 3000L;

        System.out.println(l);
        System.out.println("long: " + l2);
        System.out.println(l3);

        System.out.println();

        // example wrapper class with float
        Float f1 = new Float(4.5F);
        Float f2 = 25.5f;

        System.out.println("float: " + f1);
        System.out.println(f2);

        // example wrapper class with double
        Double d = 4.5;
        Double d2 = new Double(4.5);

        System.out.println("double: " + d);
        System.out.println(d2);

    }
}
