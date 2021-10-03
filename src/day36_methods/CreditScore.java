package day36_methods;

public class CreditScore {
    public static void main(String[] args) {
        System.out.println(getCreditScore());
        // or we can store it in variable and then print it
        int score = getCreditScore();
        System.out.println(score);

        System.out.println(hasGoodCreditScore(850));
        System.out.println(hasGoodCreditScore(750));
        if(hasGoodCreditScore(650)){
            System.out.println("Excellent score");
        }else {
            System.out.println("Bad credit score! You could do better");
        }

    }
    public static int getCreditScore(){
        return 800;
    }
    public static boolean hasGoodCreditScore(int score){
       if(score > 750){
           return true;
       }else {
           return false;
       }
    }

}
