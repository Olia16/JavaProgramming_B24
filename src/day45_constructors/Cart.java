package day45_constructors;

public class Cart {
    // item, price, quantity, isOrganic, totalPrice
    // toString checkout

    String item;
    int price;
    int quantity;
    boolean isOrganic;
    int totalSum;

    public Cart(String inItem, int inPrice, int inQuantity, boolean inOrganic){

        item = inItem;
        price = inPrice;
        quantity = inQuantity;
        isOrganic = inOrganic;
        totalSum = price * quantity;
        if(inOrganic){
            totalSum += 5;
        }
    }

    @Override
    public String toString() {
        return "Cart{" +
                "item='" + item + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", isOrganic=" + isOrganic +
                ", totalSum=" + totalSum +
                '}';
    }

    public static void main(String[] args) {
        Cart cart = new Cart("apple", 2, 5,true);
        System.out.println("checkout: " + cart);
    }
}
