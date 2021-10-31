package day54_abstraction.person;

public class WorkPlace {

    public static void main(String[] args) {
        //cannot create an object of Person class - it       is abstract class
        //Person person = new Person() {}
        //cannot create object of abstract class
        //Employee employee - new Employee()
        Tester tester = new Tester();
        tester.work();
        tester.sleep(30);
        tester.jobTitle = "Tester";
        tester.salary = 200000;

        Developer developer = new Developer();
        developer.work();
        developer.sleep(20);

        Chef chef = new Chef();
        chef.work();
        chef.sleep(60);

    }
}
