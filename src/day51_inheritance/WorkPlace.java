package day51_inheritance;

public class WorkPlace {

    public static void main(String[] args) {
        Employee obj1 = new Employee();
        obj1.name = "James";
        Tester obj2 = new Tester();
        obj2.name = "Adam";
        Developer obj3 = new Developer();
        obj3.name = "Olha";

        obj1.work();
        obj2.work();
        obj3.work();



    }
}
