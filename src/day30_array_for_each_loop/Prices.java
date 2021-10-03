package day30_array_for_each_loop;

public class Prices {
    public static void main(String[] args) {
        double [] prices = {90.4, 40.24, 140.41};
        // traditional loop
        for( int i = 0; i < prices.length; i++){
            System.out.println("$ " + prices[i]);
        }
        // for each loop
        for(double each : prices){
            System.out.println("$ " + each);
        }
    }
}
