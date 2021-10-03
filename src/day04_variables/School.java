package day04_variables;

public class School {
    public static void main(String[] args) {

        int totalNumberOfStudents;

        short numberOfStudentsIn1stGrade = 10;
        short numberOfStudentsIn2ndGrade = 20;
        short numberOfStudentsIn3rdGrade = 14;
        short numberOfStudentsIn4thGrade = 41;
        short numberOfStudentsIn5thGrade = 51;

        totalNumberOfStudents = numberOfStudentsIn1stGrade + numberOfStudentsIn2ndGrade + numberOfStudentsIn3rdGrade + numberOfStudentsIn4thGrade + numberOfStudentsIn5thGrade;

        System.out.println("In total there is " + totalNumberOfStudents + " students total");

        double numberOfSchoolDays = 100.5;
        double avgGradeInSchool = 81.6;

        System.out.println(avgGradeInSchool + "%");

//        float avgSnowDaysInAYear = 30.4; invalid
        float avgSnowDaysInAYear = 30.4F;
        //double avgSnowDaysInAYear2 = 30.4; valid

    }
}
