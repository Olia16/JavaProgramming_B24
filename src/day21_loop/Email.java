package day21_loop;

public class Email {
    public static void main(String[] args) {
        String email = "saim@cybertekschool.com";
        int postOfAt = email.indexOf("@");
        String name = email.substring(0,postOfAt);
        String domain = email.substring(postOfAt + 1);

        System.out.println("Name: " + name);
        System.out.println("Domain: " + domain);
    }
}
