package office_hours.practice_10_13_2021;

public class Developer {

    String name;
    int employeeId;
    String jobTitle;
    double salary;

    static boolean canCode;

    static {
        canCode = true;
    }

    public Developer(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public Developer(String name, int employeeId, String jobTitle, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
        this.salary = salary;

    }

    public void coding(){
        System.out.println(name + " is coding");
    }

    public void fixingBug(){
        System.out.println(name + " is fixing a bug");
    }

    @Override
    public String toString() {
        return "Developer:" +
                "name=> '" + name + '\'' +
                ", employeeId=> " + employeeId +
                ", jobTitle=> '" + jobTitle + '\'' +
                ", salary=> " + salary +
                '}';
    }
}
