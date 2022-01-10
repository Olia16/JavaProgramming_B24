package office_hours.practice_11_30_2021;

public class UsingSocialMedia {

    public static void main(String[] args) {

        FacebookUser fatma = new FacebookUser("FatmaJava","HelloJava", "Fatma O");
        System.out.println(fatma);
        System.out.println(FacebookUser.platform);
        fatma.post("Today we had office hours");
        fatma.post("I am regretting more java");
        System.out.println(fatma.getAllPosts());

        FacebookUser malika = new FacebookUser("MalikaSDET", "password", "Malika Z", 21, 5000);
        System.out.println(malika);
        malika.directMessage(fatma, "Hello!");

    }
}
