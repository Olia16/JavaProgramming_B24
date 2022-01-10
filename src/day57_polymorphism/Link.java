package day57_polymorphism;

public class Link implements WebElement{

    public String getUrl(){
        return "google.com";
    }

    @Override
    public void sendKeys(String txt) {
        System.out.println("Not valid");
    }

    @Override
    public void click() {
        System.out.println("Opening link");
    }

    @Override
    public String getText() {
        return "Link text";
    }
}
