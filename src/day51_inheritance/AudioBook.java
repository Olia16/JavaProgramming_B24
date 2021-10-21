package day51_inheritance;

public class AudioBook extends Book{

    double duration;
    String narrator;

    public void listening(){
        System.out.println("listening to " + title + " narrated by " + narrator);
    }


}
