package day57_polymorphism;

public class Web {

    public static void main(String[] args) {
        //with the reference of Link(itself) we are able to access 4 methods including getUrl
        Link link1 = new Link();
        link1.click();
        link1.sendKeys("hello");
        System.out.println(link1.getText());
        System.out.println(link1.getUrl());

        //reference of the interface that is implemented
        WebElement link2 = new Link();
        link2.click();
        link2.sendKeys("hello");
        System.out.println(link2.getText());
       // System.out.println(link2.getUrl()); -> cannot access because WebElement doesn't know what getUrl is

        WebElement [] allLinks = new WebElement[2];
        allLinks[0] = link1;
        allLinks[1] = link2;

        WebElement [] elements = new WebElement[3];
        elements[0] = link1;
        elements[1] = new Input();

    }
}
