package day49_encapsulation;

public class Rectangle {

    /*
    Task
Create a class Rectangle

    - instance variables:
        height, width

    - create a constructor to initialize height and width
        -> think about invalid data

    - create a method to calculate area

    - encapsulate
        -> for setting: numbers should not be less than 0
     */

   private int length;
   private int width;
    int area;

    public Rectangle(int height, int width) {
       setLength(length);
       setWidth(width);
    }

    public int calculate(){
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + length +
                ", width=" + width +
                ", area=" + area +
                '}';
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length > 0) {
            this.length = length;
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if(width > 0){
            this.width = width;
        }

    }
}
