package day48_static;

public class AppleStore {

    public static void main(String[] args) {
        iPhone phone1 = new iPhone("10", 1000);

        iPhone phone2 = new iPhone("12", "black", 1200, 512);

        System.out.println(phone1);
        System.out.println(phone2);

        System.out.println(iPhone.brand);
        System.out.println(iPhone.operatingSystem);
    }
}
