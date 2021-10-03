package day45_constructors;
/*
Task:

    create a class called Employee

        - data:

            name, id, job title, salary

        - constructor

            should have 4 parameters, one for each instance variable

            parameter names need to be unique

                name -> inputName

                WRONG X con(name, id, title, salary)

                DO it -> con(inputName, inputId, inputTitle, inputSalary)

            initialize the instance variables



 */

public class Employee {

    // instance variables;
    String name;
    String id;
    String jobTitle;
    int salary;

    // constructor with parameters
    public Employee(String inName, String inId, String inJob, int inSalary){

        // constructor takes 4 parameters and stores them into our instance variables
        name = inName;
        id = inId;
        jobTitle = inJob;
        salary = inSalary;
    }

    /*
        - method:
            goToMeeting()
                when this method is called print:
                 $name is going to a meeting
     */
   public void goToMeeting(){
       System.out.println(name + " is going to a meeting");
   }

    //    toString()
    //   print all the employees information

    @Override
    public String toString() {
        return "Employee |" +
                "name: '" + name + '\'' +
                ", id: '" + id + '\'' +
                ", jobTitle: '" + jobTitle + '\'' +
                ", salary: " + salary +
                '|';
    }

}
