package day51_inheritance;

public class Library {

    public static void main(String[] args) {
        Book bookOne = new Book();
        //bookOne reference has access to 6 instance variables which were made in the Book(Parent) class
        bookOne.title = "The 5 love languages";

        EBook bookTwo = new EBook();
        //bookTwo reference has access to 8 instance variables. 6 from the Book(Parent) class and 2 from Ebook class
        bookTwo.title = "Mindset";
        bookTwo.size = 50;
        bookTwo.read();

        AudioBook bookThree = new AudioBook();
        // bookThree reference has access to 8 variables. 6 from The Book (Parent) class and 2 from AudioBook class
        bookThree.title = "Think and grow rich";
        bookThree.duration = 25;
        bookThree.narrator = "Napoleon Hill";
        bookThree.listening();


    }
}
