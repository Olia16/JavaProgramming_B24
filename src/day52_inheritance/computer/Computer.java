package day52_inheritance.computer;

public class Computer {

    String os;
    int memory;

    public Computer(String os, int memory){

        this.os = os;
        this.memory = memory;
    }

    public String toString(){
        return "OS: " + os + " Memory: " + memory;
    }


}
