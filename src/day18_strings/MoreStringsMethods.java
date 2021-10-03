package day18_strings;

public class MoreStringsMethods {
    public static void main(String[] args) {
        String s = "   Apples are   ";
        System.out.println(s.trim());

        String s2 = "   ";
        System.out.println(s2.trim());

        String s3 = "";
        System.out.println(s3.isEmpty());

        String s4= " ";
        System.out.println(s4.length());
        System.out.println(s4.isEmpty());

        System.out.println();

        String s5 = "javascript";
        System.out.println(s5.startsWith("java"));
        System.out.println(s5.startsWith("Java"));
        System.out.println(s5.startsWith("j"));

        System.out.println();

        String s6 = " jump";
        System.out.println(s6.startsWith("j"));
        System.out.println(s6.startsWith(" j"));

        System.out.println();

        String s7 = "marker";
        System.out.println(s7.endsWith("r"));
        System.out.println(s7.endsWith("rke"));
        System.out.println(s7.endsWith("rker"));
        System.out.println(s7.endsWith("r "));
        System.out.println(s7.endsWith("marker"));
        System.out.println(s7.startsWith("marker"));

        System.out.println();



    }
}
