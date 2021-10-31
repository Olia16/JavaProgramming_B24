package day54_abstraction.mobile;

public class Phone {
    public static void main(String[] args) {

        MobileApp app1 = new MobileApp();
        app1.setName("Generic");
        app1.setVersion(0.1);
        app1.useApp(10);
        app1.download();

        System.out.println();

        Instagram app2 = new Instagram();

        //to access private instance var, we are using setter and getter methods
        app2.setName("instagram");
        app2.setVersion(1.1);
        app2.download();
        app2.useApp(15);

    }
}
