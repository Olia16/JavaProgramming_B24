package day46_constructors;

public class Offer {

    String location, company;
    double salary;
    boolean isFullTime;
    int numOfPTO;

    public  Offer(String company,double salary,boolean isFullTime){
        this.company = company;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }
    public Offer(String location, String company, double salary, boolean isFullTime, int numOfPTO){
        this.location = location;
        this.company = company;
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.numOfPTO = numOfPTO;

    }

    @Override
    public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                ", numOfPTO=" + numOfPTO +
                '}';
    }
}
/*

String s = "java";
s.charAt(0) -> j
s.substring(1,2) -> a

 */
