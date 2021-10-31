package day54_abstraction.person;

public class Tester extends Employee{
    @Override
    public void work() {
        System.out.println("Run Test Cases");

    }

    @Override
    public void sleep(int minutes) {
        System.out.println("Sleeping " + minutes + " while tests run automatically");

    }
}
