package day08_relational_logical_operators;

public class Examples {
    public static void main(String[] args) {
        int x = 10;
        int y = x++;

        System.out.println(y++ + " " + x++ + " " + y);
        /*

         */
        int score = 0;

        if (score == 0) {
            score += 50;
        }
        if (score != 0) {
            score += 50;
        }
        System.out.println(score);

        boolean A = true, B = !false;

        if (B) {
            System.out.println("B");
        } else if (A) {
            System.out.println("A");
        } else {
        }
        System.out.println("C");
    }
}
