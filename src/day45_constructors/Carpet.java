package day45_constructors;

public class Carpet {
    // width, length, unitPrice, if its persian, total price
    //toString total price

    int width;
    int length;
    double unitPrice;
    boolean isPersian;
    double totalPrice;

    public Carpet(int width1, int length1, double price1, boolean persian1){
        width = width1;
        length = length1;
        unitPrice = price1;
        isPersian = persian1;
        totalPrice = width * length * unitPrice;
        if(isPersian){
            totalPrice += 200;
        }
    }

    @Override
    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", totalPrice=" + totalPrice +
                '}';
    }


}
