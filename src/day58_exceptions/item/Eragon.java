package day58_exceptions.item;

import java.time.chrono.Era;

public class Eragon extends Book{

    public Eragon(){
        super("Eragon");
    }

    @Override
    public void use(){
        System.out.println("Reading Eragon");
    }
    public void sell(){
        System.out.println("selling Eragon books");
    }

}
