package day45_constructors;

public class Student {

    String name;
    int batchNum;
    double grade;

    public String toString(){

        // we can use instance variable in instance method
        String s = "Student Information:";
        s += "\nName: " + name;
        s += "\nBatch: " + batchNum;
        s += "\nGrade: " + grade;

        return s;

    }

}
