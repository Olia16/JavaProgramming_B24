package office_hours.practice_10_14_2021;

public class JoinExample {

    public static void main(String[] args) {
        String [] s = {"a", "b", "c", "d"};
        System.out.println(String.join("<>", s));
        System.out.println(String.join("-----",s));
        System.out.println(String.join("", s));
        System.out.println(String.join("*", s));
    }
}
