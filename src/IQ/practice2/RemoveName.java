package IQ.practice2;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveName {
    /*
    ArrayList -- Remove "Ahmed"
Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed.
     */
    public static void main(String[] args) {
        String[] student = {"Ahmed", "John", "Eric", "Ahmed", "Ahmeq", "Ahmed"};
        ArrayList<String> studentList = new ArrayList<>(Arrays.asList(student));
        int count = 0;

       // studentList.removeAll(Arrays.asList("Ahmed"));
        studentList.removeIf(each -> each.equalsIgnoreCase("Ahmed"));


//        for (int i = 0; i < studentList.size(); i++) {
//            if(studentList.get(i).equalsIgnoreCase("Ahmed")) studentList.remove(i);
//        }
        System.out.println(studentList);

    }
}

