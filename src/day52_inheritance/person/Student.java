package day52_inheritance.person;

import day52_inheritance.person.Person;

public class Student extends Person {

    String schoolName;

    public Student(String name, int age, int birthYear, String schoolName){
       super(name,age,birthYear);
       this.schoolName = schoolName;

    }

    public void study(){
        System.out.println(name + " is studying at " + schoolName );
    }


    /*
      child of Person:

        Student
            schoolName

            study()
     */
}
