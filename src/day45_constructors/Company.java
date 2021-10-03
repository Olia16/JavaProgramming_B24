package day45_constructors;

import java.util.Arrays;

public class Company {

    public static void main(String[] args) {

        // making our object with values directly
        Employee employee1 = new Employee("Olha", "ol0952", "SDET", 160_000);
        System.out.println("Employee info: ");
        System.out.println(employee1);// prints all the info
        System.out.println("NAME: " + employee1.name); // prints just a name
        System.out.println(employee1.id);
        System.out.println(employee1.jobTitle);
        System.out.println(employee1.salary);

        // toString method
        employee1.goToMeeting();

        // making an array
        Employee [] staff = new Employee[3];
        staff[0] = employee1;
        // making a new employee object
        staff[1] = new Employee("Nadir", "na000", "SDET", 300_000);

        System.out.println(Arrays.toString(staff));


    }
}
