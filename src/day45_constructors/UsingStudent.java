package day45_constructors;

public class UsingStudent {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "James Bond";
        student1.batchNum = 7;
        student1.grade = 90;

        System.out.println(student1.toString());// we try to call toString, but we don't need to
        System.out.println(student1); // toString is still called
    }
}
