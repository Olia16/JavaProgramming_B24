package day58_exceptions.item;

public class Store {

    public static void main(String[] args) {
        Eragon obj1 = new Eragon();//itself
        Book obj2 = new Eragon(); //parent
        Item obj3 = new Eragon(); //parent

        //also have interface for reference
        obj1.use();
        obj2.use();
        obj3.use();

        obj1.sell();// reference itself
        //obj2.sell(); parent of Eragon,  doesn't know what is 'sell' method is
        // to make it accessible, we can cast it
        ((Eragon)obj2).sell();
        // casting obj3
        ((Eragon)obj3).sell();

        purchase(new Item("wooden spoon"));
        purchase(obj1);
        purchase(new Book("Harry Potter"));

    }

    public static void purchase(Item item){
        System.out.println("Purchasing " + item.name);

    }
}
