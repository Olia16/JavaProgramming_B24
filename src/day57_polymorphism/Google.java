package day57_polymorphism;

public class Google {
    public static void main(String[] args) {

        WebElement elm1 = new Link();
        WebElement elm2 = new Input();
        WebDriveUtil.clickElements(elm1);
        WebDriveUtil.clickElements(elm2);
    }
}
