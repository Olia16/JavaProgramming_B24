package day08_relational_logical_operators;

public class SpeedLimit {

    public static void main (String []args){

        int currentSpeed = 75;
        int speedLimit = 65;

        boolean isSpeeding = currentSpeed > speedLimit;

        System.out.println("You are speeding:" + isSpeeding);

    }
}
