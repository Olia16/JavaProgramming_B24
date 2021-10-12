package day48_static;

import java.util.Arrays;

public class Classroom {

    public static void main(String[] args) {

        System.out.println("Batch: " + CydeoStudent.batchNum);
        CydeoStudent student1 = new CydeoStudent("Olha", 7, 18);
        System.out.println(student1);

        CydeoStudent student2 = new CydeoStudent("Yurii", 7, 15);
        System.out.println(student2);

        System.out.println(student1.name + " and " + student2.name + " have the following instructors: " + Arrays.toString(CydeoStudent.instructors));



        //check how much coffee all cydeo students have
        System.out.println(CydeoStudent.myCoffee.amountLeft);

        student1.myCoffee.drink(2);

        System.out.println(CydeoStudent.myCoffee.amountLeft);
        student2.myCoffee.drink(3);
        System.out.println(CydeoStudent.myCoffee.amountLeft);

    }
}
