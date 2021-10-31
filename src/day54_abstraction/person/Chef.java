package day54_abstraction.person;

public class Chef extends Employee{

    @Override
    public void work() {
        System.out.println("Cooking the meal");
    }

    @Override
    public void sleep(int minutes) {
        System.out.println("Sleep with wooden spoon " + minutes);
    }
}
