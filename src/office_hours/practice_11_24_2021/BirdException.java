package office_hours.practice_11_24_2021;

public class BirdException extends RuntimeException{
    public BirdException(){

    }
    public BirdException(int min){
        super("It is " + min + " minutes into the hour, need to go to break!");
    }

}
