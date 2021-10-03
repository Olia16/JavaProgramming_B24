package day30_array_for_each_loop;

public class GradeBook {
    public static void main(String[] args) {
        /*
        student array -> names of students
        garde values (double) -> grades of students

         */

        String [] studentNames = {"James Bond", "Jamie Fox", "Luke Smith"};
        double [] studentsGrade = {90, 80.5, 100};

        for(int i = 0; i < studentsGrade.length; i++){
            System.out.println(studentNames[i] + " ->" + studentsGrade[i]);
        }

    }
}
