package ExtraPractice;

public class StringBuilderPractice {

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        System.out.println(s.append("java"));
        s.append("script");
        System.out.println(s);
        System.out.println(s.reverse());
        System.out.println(s.reverse());
        s.delete(0,1);
        s.insert(3,"hello");
        System.out.println(s);
        String b = s.toString();
        System.out.println(b);


        System.out.println();
        reverse("hello");

    }

    public static void reverse(String s){
        StringBuilder builder = new StringBuilder(s);
        s = builder.reverse().toString();
        System.out.println(s);


    }


}
