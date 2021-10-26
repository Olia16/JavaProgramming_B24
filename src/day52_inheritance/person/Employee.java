package day52_inheritance.person;

public class Employee extends Person {

    /*
      Employee
            jobTitle, isFullTime

            work()
     */

    String jobTitle;
    boolean isFullTime;

    public void work(String name){
        System.out.println(name + " is working");
    }
}
